package com.example.demo.sort;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/14.
 */
public class BubbleSort extends sort {
    @Test
    /*冒泡排序*/
    public  void bubbleSort1(){
        int[] array= new  int[]{1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99};
        int temp;
        for(int i=0;i<array.length-1;i++){
            for(int j=1;j<array.length-i;j++) {
                if (array[j] > array[j-1]) {
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
            System.out.print("第"+(i+1)+"轮排序结果：");
            display(array);
        }
    }
}
