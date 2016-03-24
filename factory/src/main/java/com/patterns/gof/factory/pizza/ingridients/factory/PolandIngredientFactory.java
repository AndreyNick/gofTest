package com.patterns.gof.factory.pizza.ingridients.factory;

import com.patterns.gof.factory.pizza.ingridients.cheese.Cheese;
import com.patterns.gof.factory.pizza.ingridients.cheese.PolandCheese;
import com.patterns.gof.factory.pizza.ingridients.dough.Dough;
import com.patterns.gof.factory.pizza.ingridients.dough.WaterDough;
import com.patterns.gof.factory.pizza.ingridients.salami.PolandSalami;
import com.patterns.gof.factory.pizza.ingridients.salami.Salami;
import com.patterns.gof.factory.pizza.ingridients.souse.Souse;
import com.patterns.gof.factory.pizza.ingridients.souse.StorePreparedSouse;

public class PolandIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new WaterDough();
    }

    @Override
    public Souse createSouse() {
        return new StorePreparedSouse();
    }

    @Override
    public Cheese createCheese() {
        return new PolandCheese();
    }

    @Override
    public Salami createSalami() {
        return new PolandSalami();
    }
}
