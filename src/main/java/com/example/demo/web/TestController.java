package com.example.demo.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.HashMap;
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


    @RequestMapping("/redisTest")
    public String index(){
        try {
           // stringRedisTemplate.expire("key",10,TimeUnit.SECONDS);
            Boolean result = stringRedisTemplate.opsForValue().setIfAbsent("key", "value");
            //通过get方法获取存储的内容(key)
            if(result) {
                String value = stringRedisTemplate.opsForValue().get("stock");
                int i = Integer.parseInt(value);

                if(i==0){
                    System.out.println("已售完");
                }else{
                    System.out.println("当前库存"+i);
                    stringRedisTemplate.opsForValue().set("stock", --i + "");
                }

            }
        }finally {
            stringRedisTemplate.delete("key");
        }



        return "hello word";
    }

    public String testHashMap(){
        HashMap<Object, Object> hashMap = new HashMap<>();

        hashMap.put("1111","111");

        hashMap.toString();




        return "";

    }
}
