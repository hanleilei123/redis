package com.example.demo.myjuc;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.DoubleToIntFunction;

public class SSClass {
    static {
        System.out.println("SSClass");
    }
}

class SuperClass extends SSClass {
    public static int value = 123;

    static {
        System.out.println("SuperClass init!");
    }

    public SuperClass() {
        System.out.println("init SuperClass");
    }
}

class SubClass extends SuperClass {
    static int a;

    static {
        System.out.println("SubClass init");
    }

    public SubClass() {
        System.out.println("init SubClass");
    }
}

class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);


        String s1 = "aa" + "bb";
        String s2 = "aabb";
        System.out.println(s1 == s2);


        System.out.println(5 << 3);
        System.out.println(5 * (1 << 3));
    }
}

class aa {
    public static void main(String[] args) {
        System.out.println(aa.class.getClassLoader().getParent().getParent());
        System.out.println(String.class.getClassLoader());
        System.out.println(Object.class.getClassLoader());


        ThreadLocal<String> connectionHolder = new ThreadLocal<>();

        connectionHolder.set("999999999");

        System.out.println(connectionHolder.get());


        new HashMap<>().put("111", "111");


    }
}


class TestIterator {

    public static void main(String[] args) {


        ArrayList list = new ArrayList();
        Map map = new HashMap();
        for (int i = 0; i < 10; i++) {
            list.add(new String("list" + i));
            map.put(i, new String("map" + i));
        }
        Iterator iterList = list.iterator();//List接口实现了Iterable接口
        while (iterList.hasNext()) {
            String strList = (String) iterList.next();
           // iterList.remove();
            System.out.println(strList.toString());
        }
        System.out.println(Arrays.toString(list.toArray()));
        Iterator iterMap = map.entrySet().iterator();
        while (iterMap.hasNext()) {
            Map.Entry strMap = (Map.Entry) iterMap.next();
            System.out.println(strMap.getValue());
        }
    }
}


