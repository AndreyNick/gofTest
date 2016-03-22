package com.patterns.gof.factory.pizza;

import org.junit.Test;

public class PizzaTest {

    @Test
    public void pizzaTest() {
        PizzaStore store = new WidenPizzaStore();
        store.orderPizza("tomato");

    }

}