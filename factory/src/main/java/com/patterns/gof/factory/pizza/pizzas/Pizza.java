package com.patterns.gof.factory.pizza.pizzas;

import com.patterns.gof.factory.pizza.ingridients.cheese.Cheese;
import com.patterns.gof.factory.pizza.ingridients.dough.Dough;
import com.patterns.gof.factory.pizza.ingridients.salami.Salami;
import com.patterns.gof.factory.pizza.ingridients.souse.Souse;

public abstract class Pizza {

    protected String name;
    protected int bakeTime;
    protected Dough dough;
    protected Souse souse;
    protected Cheese cheese;
    protected Salami salami;


    public String getName() {
        return name;
    }

    public int getBakeTime() {
        return bakeTime;
    }

    public void prepare() {
        System.out.println("Preparing " + getName() + " pizza");
    }

    public void bake() {
        System.out.println("Baking pizza during " + getBakeTime() + " minutes");
    }

    public void cut() {
        System.out.println("Cut into peaces");
    }

    public void box() {
        System.out.println("Put into the box");
    }
}
