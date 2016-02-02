package com.patterns.gof.strategy.heroes;

/**
 * Created by anni0913 on 02.02.2016.
 */
public class Knight extends Character {
    public Knight() {
        fightBehaviour = new FightBySabre();
        runBehaviour = new RunOnHorse();
    }

    @Override
    public void nameYourself() {
        System.out.println("I am a brave knight");
    }
}
