package com.patterns.gof.factory.pizza;


public abstract class Pizza {

    protected String name;

    String getName() {
        return name;
    }
    void prepare() {
        System.out.println("Preparing " + getName() + " pizza");
    }
    void bake() {
        System.out.println("Baking " + getName() + " pizza");
    }
    void cut() {
        System.out.println("Cut into peaces");
    }
    void box() {
        System.out.println("Put into the box");
    }

}
