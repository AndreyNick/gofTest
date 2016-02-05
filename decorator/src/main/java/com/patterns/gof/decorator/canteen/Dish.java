package com.patterns.gof.decorator.canteen;

/**
 * Created by anni0913 on 04.02.2016.
 */
public interface Dish {
    public String getDescription();
    public float getPrice();
    public char getSize();
    public void setSize(char size);

}
