package com.java.logicmojo;

public class BiCycle implements Bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("there is no engine !");
    }

    @Override
    public void accelerate() {
        //do something//
    }
}
