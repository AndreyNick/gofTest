package com.patterns.gof.factory.pizza;


public abstract class Pizza {

    protected String name;

    void prepare() {
        System.out.println("Baking " + getName() + " pizza");
    }

    String getName() {
        return name;
    }

    abstract void bake();
    abstract void cut();
    abstract void box();

}
