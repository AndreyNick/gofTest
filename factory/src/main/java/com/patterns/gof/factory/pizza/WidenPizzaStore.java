package com.patterns.gof.factory.pizza;


public class WidenPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if("mozarella".equals(type)) {
            return new MozarellaPizza();
        } else if("tomato".equals(type)) {
            return new TomatoPizza();
        } else return null;
    }
}
