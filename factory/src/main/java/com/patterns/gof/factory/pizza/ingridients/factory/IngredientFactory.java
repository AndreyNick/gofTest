package com.patterns.gof.factory.pizza.ingridients.factory;

import com.patterns.gof.factory.pizza.ingridients.cheese.Cheese;
import com.patterns.gof.factory.pizza.ingridients.dough.Dough;
import com.patterns.gof.factory.pizza.ingridients.salami.Salami;
import com.patterns.gof.factory.pizza.ingridients.souse.Souse;

public interface IngredientFactory {


    /*
    This case is called Abstract Fabric
     */
    Dough createDough();
    Souse createSouse();
    Cheese createCheese();
    Salami createSalami();
}
