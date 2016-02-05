package com.patterns.gof.decorator.canteen;

/**
 * Created by anni0913 on 04.02.2016.
 */
public class CheeseSous extends DishAddingsRealisation {
    public CheeseSous(Dish dish) {
        super(dish);
        price = 12;
        description = "Delicious cheese sous";
    }

    public CheeseSous() {
        price = 12;
        description = "Delicious cheese sous";
    }
}
