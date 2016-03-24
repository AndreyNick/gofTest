package com.patterns.gof.factory.pizza;

import com.patterns.gof.factory.pizza.stores.MilanPizzaStore;
import com.patterns.gof.factory.pizza.stores.PizzaFactory;
import com.patterns.gof.factory.pizza.stores.WidenPizzaStore;
import org.junit.Test;

public class PizzaTest {

    @Test
    public void pizzaTomatoFromWidenTest() {
        PizzaFactory store = new WidenPizzaStore();
        store.orderPizza("tomato");
    }

    @Test
    public void pizzaTomatoFromMilanTest() {
        PizzaFactory store = new MilanPizzaStore();
        store.orderPizza("tomato");
    }

    @Test
    public void pizzaMozzarellaFromWidenTest() {
        PizzaFactory store = new WidenPizzaStore();
        store.orderPizza("mozzarella");
    }

    @Test
    public void pizzaMozzarellaFromMilanTest() {
        PizzaFactory store = new MilanPizzaStore();
        store.orderPizza("mozzarella");
    }
}