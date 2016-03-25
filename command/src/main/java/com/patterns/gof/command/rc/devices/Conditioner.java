package com.patterns.gof.command.rc.devices;

public class Conditioner {

    public void on() {
        System.out.println("Air conditioner on");
    }

    public void off() {
        System.out.println("Air conditioner off");
    }

    public void switchTempUp() {
        System.out.println("Air conditioner temperature up");
    }

    public void switchTempDown() {
        System.out.println("Air conditioner temperature down");
    }


}
