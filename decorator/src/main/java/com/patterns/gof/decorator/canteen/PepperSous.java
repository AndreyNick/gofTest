package com.patterns.gof.decorator.canteen;

/**
 * Created by anni0913 on 04.02.2016.
 */
public class PepperSous extends DishAddingsRealisation {

    public PepperSous(Dish dish) {
        description = "Pepper sous";
        this.dish = dish;
    }

    @Override
    public float getPrice() {
        return dish.getPrice() + 5;
    }
}
