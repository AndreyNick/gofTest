package com.patterns.gof.decorator.canteen;

/**
 * Created by anni0913 on 04.02.2016.
 */
public interface Dish {
    public enum Size {
        SMALL,
        MIDDLE,
        LARGE
    }
    public String getDescription();
    public float getPrice();
    public Size getSize();
    public void setSize(Size size);
}
