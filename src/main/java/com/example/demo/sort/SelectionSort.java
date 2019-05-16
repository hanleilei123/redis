package com.example.demo.sort;

import org.junit.Test;

/**
 * Created by Administrator on 2019/5/14.
 */
public class SelectionSort  extends Sort {
    /*
    * 选择排序
    * 排序的时间复杂度为O(N2)
    * */
    @Test
    public void  selectionSortMin(){
        int length = array.length;
        int minPoint;
        int temp;
        for(int i=0;i<length-1;i++){
            minPoint=i;
            for(int j=i+1;j<=length-1;j++){
                if(array[j]<array[minPoint]){   //如果待排数组中的某个元素比当前元素小，minPoint指向该元素的下标
                    minPoint=j;
                }
            }
            if(minPoint!=i){  //如果发现了更小的元素，交换位置
                temp=array[i];
                array[i]=array[minPoint];
                array[minPoint]=temp;
            }
            display(array);
        }

    }


    @Test
    public void  selectionSortMax(){
        int length = array.length;
        int maxPoint;
        int temp;
        for(int i=0;i<length-1;i++){
            maxPoint=i;
            for(int j=i+1;j<=length-1;j++){
                if(array[j]>array[maxPoint]){
                    maxPoint=j;
                }
            }
            if(maxPoint!=i){
                temp=array[i];
                array[i]=array[maxPoint];
                array[maxPoint]=temp;
            }
            display(array);
        }

    }
}
