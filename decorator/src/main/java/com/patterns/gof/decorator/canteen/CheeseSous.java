package com.patterns.gof.decorator.canteen;

/**
 * Created by anni0913 on 04.02.2016.
 */
public class CheeseSous extends DishAddingsRealisation {

    public CheeseSous(Dish dish) {
        description = "Cheese sous";
        this.dish = dish;
    }

    @Override
    public float getPrice() {
        switch (getSize()) {
            case SMALL:
                price = 5;
                break;
            case MIDDLE:
                price = 7;
                break;
            case LARGE:
                price =  9;
                break;
        }
        return price + dish.getPrice();
    }
}
