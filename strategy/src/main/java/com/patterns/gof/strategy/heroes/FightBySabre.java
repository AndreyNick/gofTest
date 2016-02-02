package com.patterns.gof.strategy.heroes;

/**
 * Created by anni0913 on 02.02.2016.
 */
public class FightBySabre implements FightBehaviour {
    @Override
    public void fight() {
        System.out.println("Fight by sword");
    }
}
