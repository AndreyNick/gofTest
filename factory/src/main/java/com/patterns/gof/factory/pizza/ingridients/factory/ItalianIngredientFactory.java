package com.patterns.gof.factory.pizza.ingridients.factory;

import com.patterns.gof.factory.pizza.ingridients.cheese.Cheese;
import com.patterns.gof.factory.pizza.ingridients.cheese.ItalianCheese;
import com.patterns.gof.factory.pizza.ingridients.dough.Dough;
import com.patterns.gof.factory.pizza.ingridients.dough.WaterDough;
import com.patterns.gof.factory.pizza.ingridients.salami.ItalianSalami;
import com.patterns.gof.factory.pizza.ingridients.salami.Salami;
import com.patterns.gof.factory.pizza.ingridients.souse.PackedSouse;
import com.patterns.gof.factory.pizza.ingridients.souse.Souse;

public class ItalianIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new WaterDough();
    }

    @Override
    public Souse createSouse() {
        return new PackedSouse();
    }

    @Override
    public Cheese createCheese() {
        return new ItalianCheese();
    }

    @Override
    public Salami createSalami() {
        return new ItalianSalami();
    }
}
