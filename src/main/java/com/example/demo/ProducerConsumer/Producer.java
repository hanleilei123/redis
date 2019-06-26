package com.example.demo.ProducerConsumer;

import java.util.Queue;

/**
 * Created by Administrator on 2019/6/17.
 */
public class Producer extends Thread {
    private Queue<Integer> queue;
    String name;
    int maxSize;
    int i = 0;

    public Producer(String name, Queue<Integer> queue, int maxSize) {
        super(name);
        this.name = name;
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while(true){

        }
    }
}
