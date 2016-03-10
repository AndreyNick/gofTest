package com.patterns.gof.decorator.canteen;

public class Main {
    public static void main(String args[]) {
        Dish pasta = new Pasta();
        pasta.setSize(Dish.Size.LARGE);
        pasta = new PepperSous(pasta);
        pasta = new CheeseSous(pasta);
        System.out.println(pasta.getDescription() + "\n" + pasta.getPrice());
    }
}
