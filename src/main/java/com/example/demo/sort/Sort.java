package com.example.demo.sort;

/**
 * Created by Administrator on 2019/5/14.
 */
public class Sort {

    public static int[] array = null;

    static {
      //  array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        array = new int[]{7,1,9,2,5,10,6,4,3,8};
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

}
