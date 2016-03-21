package com.patterns.gof.factory.pizza;

/**
 * Created by anni0913 on 21.03.2016.
 */
public class MozarellaPizza extends Pizza {

    public MozarellaPizza() {
        name = "Mozarella";
    }

    @Override
    public void bake() {
        System.out.println("Bake in 360 degrees during 25 minutes");
    }

    @Override
    public void cut() {
        System.out.println("");
    }

    @Override
    public void box() {
        System.out.println("");
    }
}
