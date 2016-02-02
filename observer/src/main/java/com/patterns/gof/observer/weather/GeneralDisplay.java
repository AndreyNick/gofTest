package com.patterns.gof.observer.weather;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by anni0913 on 02.02.2016.
 */
public class GeneralDisplay implements DisplayElement, Observer {

    Observable observable;
    private float temperature;
    private float pressure;
    private float humidity;

    public GeneralDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * General way of displaying info.
     * Here could be pictures, graphics etc.
     */
    @Override
    public void display() {
        System.out.println("GeneralDisplay{" +
                "temperature=" + temperature +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}');
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();


        }

    }
}
