package com.singleton;

public class StaticBlock {

    private static StaticBlock instance;

    private StaticBlock(){}

    static{
        instance = new StaticBlock();
    }

    public static StaticBlock getInstance(){
        return instance;
    }
}
