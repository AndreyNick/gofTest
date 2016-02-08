package com.patterns.gof.decorator.canteen;

/**
 * Created by anni0913 on 04.02.2016.
 */
public class Main {
    public static void main(String args[]) {
        Dish pasta = new Pasta();
        pasta.setSize(Dish.Size.MIDDLE);
        pasta = new PepperSous(pasta);
        pasta = new CheeseSous(pasta);
        System.out.println(pasta.getDescription() + "\n" + pasta.getPrice());
    }
}
