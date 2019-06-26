package com.example.demo.AlgorithmPractices;

import org.junit.Test;

/**位图法
 * Created by Administrator on 2019/6/17.
 */
public class WeiTuFaTest {
    static byte[] aaa =new byte[16];
    static int[] bbb ={5,1,7,15,0,4,6,10};
    @Test
  public   void test(){
        try {


        int length = bbb.length;
        for(int i=0;i<length;i++){
            int index=bbb[i];
            aaa[index]=1;
        }
        display(aaa);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
    public void display(byte[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
}
