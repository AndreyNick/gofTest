package com.patterns.gof.decorator.canteen;

/**
 * Created by anni0913 on 04.02.2016.
 */
public class Pasta implements Dish {
    private String description;
    private float price;

    public Pasta() {
        description = "Italian pasta";
        price = 40;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public char getSize() {


    }

    @Override
    public void setSize(char size) {

    }
}
