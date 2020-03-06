package com.example.demo;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

public class MS {

    public static void main(String[] args) {
        //question1();
        // question3();

        question5();

    }

    private static void question5() {
        int n = 100;
        MyNode head = new MyNode();
        MyNode cur;
        MyNode target;
        cur = head.next;  //当前节点
        MyNode temp ;//临时节点

        if (cur != null) {
            while (cur.next != null) {
                temp = cur.next;//保存当前节点的后续节点
                while ((target = temp.next) != null) {
                    if (target.data == n - cur.data) { //获取移动的目标节点
                        target.pre.next=null;  //把目标节点的上一节点的后续节点置为空
                       //连接链表
                        cur.next=target;
                        target.pre=cur;
                        target.next=temp;
                        temp.pre=target;
                        continue;
                    }
                }
                cur=temp; //处理后续节点
            }
        }
    }

    private static void question3() {
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                if (Integer.toString(i).contains("0") || Integer.toString(j).contains("0")) continue;
                if (i * j ==
                        Integer.valueOf(Integer.toString(i).charAt(1) + "" + Integer.toString(i).charAt(0)) *
                                Integer.valueOf(Integer.toString(j).charAt(1) + "" + Integer.toString(j).charAt(0))) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }

    private static void question1() {
        int[] array = {10, 7, 5, 4};
        for (int i = 1; i < 10 * 12; i++) { //10年，每年12个月
            for (int j = 0; j < array.length; j++) {
                if (array[j] >= 8) {
                    array[j] = array[j] - 3;
                } else {
                    array[j] = array[j] + 1;
                }
            }
        }
    }


}

class MyNode {
    public int data;
    public MyNode next;
    public MyNode pre;

    public int getData() {
        return data;
    }

    public MyNode getNext() {
        return next;
    }

    public MyNode getPre() {
        return pre;
    }
}
