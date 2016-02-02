package com.patterns.gof.strategy.heroes;

/**
 * Created by anni0913 on 02.02.2016.
 */
public abstract class Character {

    FightBehaviour fightBehaviour;
    RunBehaviour runBehaviour;

    protected Character() {
    }

    public abstract void nameYourself();

    public void run() {
        runBehaviour.run();
    }

    public void fight() {
        fightBehaviour.fight();
    }

}
