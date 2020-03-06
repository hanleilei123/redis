package com.example.demo.web;


import com.sun.prism.impl.ps.CachingShapeRep;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/5/7.
 */
@RestController
public class TestController {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    /*@RequestMapping("/redisTest")
    public String index() {
        UUID uuid = UUID.randomUUID();
          *//*  stringRedisTemplate.expire("key",10,TimeUnit.SECONDS);
            Boolean result = stringRedisTemplate.opsForValue().setIfAbsent("key", "value");*//*
        stringRedisTemplate.opsForValue().set("lockey", uuid.toString(), 10, TimeUnit.SECONDS);
        //通过get方法获取存储的内容(key)
        try {
            String value = stringRedisTemplate.opsForValue().get("stock");
            int i = Integer.parseInt(value);

            if (i == 0) {
                System.out.println("已售完");
            } else {
                System.out.println("当前库存" + i);
                stringRedisTemplate.opsForValue().set("stock", --i + "");
            }

        } finally {
            if (uuid.toString().equals(stringRedisTemplate.opsForValue().get("lockey"))) {
                stringRedisTemplate.delete("lockey");
            }
        }


        return "hello word";
    }
*/
    @Test
    public void testHashMap() throws Exception {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("1111", "111");
        hashMap.get("1111");
        hashMap.toString();
        Map m = Collections.synchronizedMap(hashMap);


        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.get("1111");
        File file = new File("");
        BufferedReader in1 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));//字符流
        DataInputStream in2 = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));//字节流

        LinkedList<Object> objects = new LinkedList<>();



        return;
    }
}


class a {
    public static void main(String[] args) throws IOException {
        //Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        // System.out.println(16*0.75);

       /* float a=1.0f-0.9f;
         a=1.0f-0.3f;
        float b=0.9f-0.7f;
        float c=0.8f-0.6f;
        float d=1.7f-1.0f;
        System.out.println("a"+a);
        System.out.println("b"+b);
        System.out.println("c"+c);
        System.out.println("d"+d);*/
        Float v = 1.0f;
/*
        String param = null;
        switch (param) {
            case "null":
                break;
            default:
                System.out.println("default");
        }*/
        BigDecimal a = new BigDecimal("0.1");
        System.out.println(a);


        HashMap<Object, Object> hashMap = new HashMap<>();

        HashSet<Object> hashSet = new HashSet<>();

        Hashtable<Object, Object> hashtable = new Hashtable<>();



    }

}
class aaa{
    public static void main(String[] args) {
        String s= new String("shello");

        StringBuilder stringBuilder = new StringBuilder("stringBuilderHello");
        StringBuffer stringBuffer = new StringBuffer("stringBuilderHello");
        modify(s);
        modify(stringBuilder);
        System.out.println(s);
        System.out.println(stringBuilder);


        HashMap<Object, Object> hashMap = new HashMap<>();

        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(hashMap);

        objectObjectMap.put(null,null);





     /*   StringBuffer stringBuffer = new StringBuffer(); //16
        StringBuilder stringBuilder = new StringBuilder(); //16
        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>(); //11
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>(); //16
        HashSet<Object> objects1 = new HashSet<>(); //底层实现为hashMap
        ArrayList<Object> objects = new ArrayList<>(); //10*/
    }

    private static void modify(String s) {
        s+="wwwww";

    }
    private static void modify(StringBuilder s) {
        s.append("Stringbuilder");
    }
}


