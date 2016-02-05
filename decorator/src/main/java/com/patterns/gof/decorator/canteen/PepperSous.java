package com.patterns.gof.decorator.canteen;

/**
 * Created by anni0913 on 04.02.2016.
 */
public class PepperSous extends DishAddingsRealisation {

    public PepperSous(Dish dish) {
        super(dish);
        price = 10;
        description = "Hot pepper sous";
    }

    public PepperSous() {
        price = 10;
        description = "Hot pepper sous";
    }

}
