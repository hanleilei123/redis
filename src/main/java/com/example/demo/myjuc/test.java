package com.example.demo.myjuc;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class test {
    static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();


        objectObjectHashMap.put("1","2");
        objectObjectHashMap.put("2","2");
        objectObjectHashMap.put("3","3");


        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();

        objectObjectConcurrentHashMap.put(null,null);



        Thread t1 = new Thread() {
            @Override
            public void run() {
                testSync();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                testSync();
            }
        };
        t1.setName("t1");
        t2.setName("t2");
       /* t1.start();
        t2.start();*/
    }

    public static void testSync() {

        reentrantLock.lock();
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        } finally {
            reentrantLock.unlock();
        }
    }
}

class a{
    public static void main(String[] args) {
       // new SoftReference<>()
        //new WeakReference<>()
      //  new PhantomReference<>()
    }
}
