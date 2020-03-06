package com.example.demo.test;

import java.util.HashMap;

public class MapTest {

    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();

        hashMap.put("111","111");
        int hashCode = "111".hashCode();
        System.out.println(hashCode);
        System.out.println(hashCode%16);

    }
}
