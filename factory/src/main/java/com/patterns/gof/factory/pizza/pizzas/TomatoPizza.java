package com.patterns.gof.factory.pizza.pizzas;

import com.patterns.gof.factory.pizza.ingridients.factory.IngredientFactory;

public class TomatoPizza extends Pizza {

    IngredientFactory ingredientFactory;

    public TomatoPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Tomato Pizza";
        bakeTime = 25;
    }

    /*
    We have to notice that we realised only 2 ingredients
    from all ingredients in Pizza class for Tomato pizza
     */
    @Override
    public void prepare() {
        super.prepare();
        souse = ingredientFactory.createSouse();
        cheese = ingredientFactory.createCheese();
        System.out.println("Ingredients: "
                + cheese.getName() + ", "
                + souse.getName());
    }
}
