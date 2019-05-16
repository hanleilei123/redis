package com.example.demo.sort;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/15.
 */
public class InsertionSort extends Sort {


    //插入排序
    @Test
    public void insertionSort() {

        int len = array.length;
        int counter = 1;
        display(array);
        for (int i = 1; i < len; i++) {

            int temp = array[i];  //存储待排序的元素值
            int insertPoint = i - 1;  //与待排序元素值作比较的元素的下标

            while (insertPoint >= 0 && array[insertPoint] < temp) { //当前元素比待排序元素大
                array[insertPoint + 1] = array[insertPoint];  //当前元素后移一位
                insertPoint--;
            }
            array[insertPoint + 1] = temp;  //找到了插入位置，插入待排序元素

            System.out.print("第" + counter + "轮排序结果：");
            display(array);
            counter++;
        }


    }


}
