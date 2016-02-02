package com.patterns.gof.observer.weather;

/**
 * Created by anni0913 on 02.02.2016.
 */
public class Main {
    public static void main(String args[]) {
        WeatherData weatherData = new WeatherData();
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);

        weatherData.setMeasurements(30, 40, 50);
    }
}
