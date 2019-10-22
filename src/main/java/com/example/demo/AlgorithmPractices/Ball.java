package com.example.demo.AlgorithmPractices;

import org.junit.Test;

/**小球下落递归算法
 * Created by Administrator on 2019/6/10.
 */
public class Ball {
    private static int count = 1;
    private static Double sum = 100D;

    public static void main(String[] args) {
        //100m
        come(100f);
        System.out.println("12 sum:" + sum);
    }

    private static Float come(Float mi) {
           if(count!=1){
               sum=sum +mi/2*2;
           }
        System.out.println(count +"   "+ mi/2 +"  " + sum);
        if (count++ < 10) {
            come(mi / 2);
        }
        return mi/2;
    }

}
