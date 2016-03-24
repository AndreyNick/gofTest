package com.patterns.gof.factory.pizza.pizzas;

import com.patterns.gof.factory.pizza.ingridients.factory.IngredientFactory;

public class MozzarellaPizza extends Pizza {

    IngredientFactory ingredientFactory;

    public MozzarellaPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Mozzarella";
        bakeTime = 15;
    }

    /*
    We have to notice that we realised only 3 ingredients
    from all ingredients in Pizza class for Mozzarella pizza
     */
    @Override
    public void prepare() {
        super.prepare();
        cheese = ingredientFactory.createCheese();
        dough = ingredientFactory.createDough();
        salami = ingredientFactory.createSalami();
        System.out.println("Ingredients: "
                + cheese.getName() + ", "
                + dough.getName() + ", "
                + salami.getName());
    }
}
