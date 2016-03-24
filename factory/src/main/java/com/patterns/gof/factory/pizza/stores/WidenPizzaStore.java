package com.patterns.gof.factory.pizza.stores;


import com.patterns.gof.factory.pizza.ingridients.factory.IngredientFactory;
import com.patterns.gof.factory.pizza.ingridients.factory.PolandIngredientFactory;
import com.patterns.gof.factory.pizza.pizzas.MozzarellaPizza;
import com.patterns.gof.factory.pizza.pizzas.TomatoPizza;
import com.patterns.gof.factory.pizza.pizzas.Pizza;

public class WidenPizzaStore extends PizzaFactory {

    Pizza pizza;
    IngredientFactory ingredientFactory = new PolandIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        if("mozzarella".equals(type)) {
            return new MozzarellaPizza(ingredientFactory);
        } else if("tomato".equals(type)) {
            return new TomatoPizza(ingredientFactory);
        }
        return pizza;
    }
}
