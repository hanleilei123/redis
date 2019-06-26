package com.example.demo.designpattern.strategy;

public class Context {
    public Strategy strategy;
    public Context(){ }

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
