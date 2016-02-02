package com.patterns.gof.strategy.heroes;

/**
 * Created by anni0913 on 02.02.2016.
 */
public class Main {
    public static void main(String args[]) {
        Character knight = new Knight();
        knight.nameYourself();
        knight.run();
        knight.fight();
    }
}
