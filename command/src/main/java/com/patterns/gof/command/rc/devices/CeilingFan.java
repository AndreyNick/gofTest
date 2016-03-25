package com.patterns.gof.command.rc.devices;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setHigh() {
        speed = HIGH;
        System.out.println("Fan speed high");
    }

    public void setMedium() {
        speed = MEDIUM;
        System.out.println("Fan speed medium");
    }

    public void setLow() {
        speed = LOW;
        System.out.println("Fan speed low");
    }

    public void setOff() {
        speed = OFF;
        System.out.println("Fan off");
    }
}
