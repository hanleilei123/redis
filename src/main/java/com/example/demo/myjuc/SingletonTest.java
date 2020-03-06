package com.example.demo.myjuc;

import java.util.HashMap;

public class SingletonTest {
    private SingletonTest() {}

    private static class  SingletonTestInner{
        private    static final SingletonTest SINGLETON_TEST=new SingletonTest();
    }
   public SingletonTest getSingletonTest(){
        return SingletonTestInner.SINGLETON_TEST;
    }

    public static void main(String[] args) {
      //  System.out.println(6*(1<<5));
      //  System.out.println(6<<5);
        System.out.println(div(1,0));
        System.out.println(div(1,1));
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("33","");

    }
    public  static int div(int n1,int n2){
        try{
            return n1/n2;
        }catch (Exception e){
            return -1;
        }finally {
            return -2;
        }
    }
}


