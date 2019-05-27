package com.example.demo.AlgorithmPractices;

import org.junit.Test;

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
