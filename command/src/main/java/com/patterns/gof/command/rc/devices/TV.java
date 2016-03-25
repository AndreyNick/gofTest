package com.patterns.gof.command.rc.devices;

public class TV {

    public void turnOn() {
        System.out.println("Turn on TV");
    }

    public void turnOff() {
        System.out.println("Turn off TV");
    }

    public void switchChannelForward() {
        System.out.println("TV channel switched up");
    }

    public void switchChannelBackward() {
        System.out.println("TV channel switched down");
    }
}
