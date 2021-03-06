package com.example.demo.designpattern.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        Context context;
        context=new Context(new ConcreateStrategyA());
        context.ContextInterface();

        context=new Context(new ConcreateStrategyB());
        context.ContextInterface();

        context=new Context(new ConcreateStrategyC());
        context.ContextInterface();

    }
}
