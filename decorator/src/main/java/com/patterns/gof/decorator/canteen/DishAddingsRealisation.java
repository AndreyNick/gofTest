package com.patterns.gof.decorator.canteen;

/**
 * Created by anni0913 on 04.02.2016.
 */
public class DishAddingsRealisation implements DishAddings {

    private Dish dish;
    protected String description;
    protected float price;

    public DishAddingsRealisation(Dish dish) {
        this.dish = dish;
    }

    public DishAddingsRealisation() {
    }

    @Override
    public String getDescription() {
        return dish.getDescription() + " with " + description;
    }

    @Override
    public float getPrice() {
        return dish.getPrice() + price;
    }
}
