package com.example.demo.myjuc;


import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class TestPark {

    static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                testSync();
            }
        };

        t1.setName("t1");
        t1.start();
        Thread.sleep(2000);

        System.out.println("main");
        LockSupport.unpark(t1);

    }

    public static void testSync() {

        System.out.println(Thread.currentThread().getName());
        LockSupport.park();

        System.out.println("t1------");
    }
}
