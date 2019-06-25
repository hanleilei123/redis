package com.example.demo.designpattern.strategy;
//具体算法A
public class ConcreateStrategyB extends Strategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B实现");
    }
}