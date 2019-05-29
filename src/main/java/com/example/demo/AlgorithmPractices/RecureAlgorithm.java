package com.example.demo.AlgorithmPractices;

import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/5/27.
 */
public class RecureAlgorithm {
    @Test
    public void add(){
        int i;
        i=10;
        int result = recureAdd(i);
        System.out.println(i+"的累加："+result);
        int multiResult = recureMulti(i);
        System.out.println(i+"的阶乘："+multiResult);
        System.out.println(Math.pow(2,4));

        ArrayList<Object> lists =null;
        //lists=new ArrayList<>();
       // lists.add(1);
        //集合工具类
        System.out.println( CollectionUtils.isEmpty(lists));
    }

    private int  recureAdd(int i) {
        if(i==1){
            return i;
        }else{
            return i+recureAdd(--i);
        }
    }
     int recureMulti(int i){
         if(i==1){
             return i;
         }else{
             return i*recureMulti(--i);
         }
    }
}
