package com.java.logicmojo;

public class MotorCycle implements Bike{
    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
    }

    @Override
    public void accelerate() {
        speed = speed + 10;
    }

}



