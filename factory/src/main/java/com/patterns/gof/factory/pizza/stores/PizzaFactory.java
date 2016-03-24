package com.patterns.gof.factory.pizza.stores;

import com.patterns.gof.factory.pizza.pizzas.Pizza;

public abstract class PizzaFactory {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
