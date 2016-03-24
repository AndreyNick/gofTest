package com.patterns.gof.factory.pizza.ingridients.souse;

public class StorePreparedSouse implements Souse {
    @Override
    public String getName() {
        return "Souse that was prepared in the pizzeria";
    }
}
