package com.patterns.gof.decorator.canteen;

/**
 * Created by anni0913 on 08.02.2016.
 */
public abstract class DishAddingsRealisation implements DishAddings {

    protected Dish dish;
    protected String description;
    protected float price;


    @Override
    public String getDescription() {
        return dish.getDescription() + " + " + description;
    }

    @Override
    public Size getSize() {
        return dish.getSize();
    }

    @Override
    public void setSize(Size size) {
        dish.setSize(size);
    }
}
