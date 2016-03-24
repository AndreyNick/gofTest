package com.patterns.gof.factory.pizza.stores;

import com.patterns.gof.factory.pizza.ingridients.factory.IngredientFactory;
import com.patterns.gof.factory.pizza.ingridients.factory.ItalianIngredientFactory;
import com.patterns.gof.factory.pizza.pizzas.MozzarellaPizza;
import com.patterns.gof.factory.pizza.pizzas.Pizza;
import com.patterns.gof.factory.pizza.pizzas.TomatoPizza;

public class MilanPizzaStore extends PizzaFactory {

    Pizza pizza;
    IngredientFactory ingredientFactory = new ItalianIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {

        if("mozzarella".equals(type)){
            pizza = new MozzarellaPizza(ingredientFactory);
        } else if("tomato".equals(type)){
            pizza = new TomatoPizza(ingredientFactory);
        }
        return pizza;
    }
}
