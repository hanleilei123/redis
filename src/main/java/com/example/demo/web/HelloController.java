package com.example.demo.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Created by Administrator on 2019/3/28.
 */
@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

     @RequestMapping(value = "/hello")
    public String index(){
         logger.debug("hello");
        System.out.println("hello");
        Semaphore semaphore = new Semaphore(2);

        return "hello word";
    }
}


 class MLDNTestDemo {
    public static void main(String[] args) throws Exception {
        // 2个线程全部执行完毕后可以继续执行
        CountDownLatch cdl = new CountDownLatch(2) ;
        for (int x = 0; x < 2; x++) {
            new Thread(() -> {
                System.out.println("【"
                        +Thread.currentThread().getName()
                        +"】线程应用执行完毕。");
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                cdl.countDown(); // 减少等待的线程个数

            },"线程对象-" + x).start();
        }
        cdl.await();   // 等待计数的结束（个数0）
        System.out.println("【*** 主线程 ***】所有的程序执行完毕。");
    }
}

 class MLDNTestDemo1 {
    public static void main(String[] args) throws Exception {
        // 当凑够2个线程就进行触发
        CyclicBarrier cb = new CyclicBarrier(2);
        for (int x = 0; x < 3; x++) {
            int sec = x ;
            new Thread(() -> {
                System.out.println("【"
                        + Thread.currentThread().getName()
                        + " - 等待开始】");
                try {
                    TimeUnit.SECONDS.sleep(sec);
                    cb.await(6,TimeUnit.SECONDS); // 等待处理
                } catch (Exception e) { e.printStackTrace();  }
                System.out.println("【"
                        + Thread.currentThread().getName()
                        + " - 等待结束】");
            }, "娱乐者-" + x).start();
        }
    }
}
