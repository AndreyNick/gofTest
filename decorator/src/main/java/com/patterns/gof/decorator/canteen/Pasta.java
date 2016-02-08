package com.patterns.gof.decorator.canteen;

/**
 * Created by anni0913 on 04.02.2016.
 */
public class Pasta implements Dish {

    private Size size;
    private String description;
    private float price;

    public Pasta() {
        description = "Italian pasta";
        size = Size.LARGE; //default
    }

    @Override
    public String getDescription() {
        return size + " " + description;
    }

    @Override
    public float getPrice() {
        switch (size) {
            case SMALL:
                price = 30;
            break;
            case MIDDLE:
                price = 35;
            break;
            case LARGE:
                price =  40;
            break;
        }
        return price;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public void setSize(Size size) {
       this.size = size;
    }
}
