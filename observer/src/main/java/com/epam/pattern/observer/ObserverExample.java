package com.epam.pattern.observer;

import com.epam.pattern.observer.observable.WeatherStation;
import com.epam.pattern.observer.observer.CurrentWeatherDisplay;

public class ObserverExample {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentWeatherDisplay tv = new CurrentWeatherDisplay("TV");
        CurrentWeatherDisplay web = new CurrentWeatherDisplay("WEB");

        weatherStation.registerObserver(tv);
        weatherStation.registerObserver(web);

        weatherStation.setMeasurements(19.4f, 52.1f);
        weatherStation.setMeasurements(21.9f, 47.3f);

        weatherStation.removeObserver(tv);

        weatherStation.setMeasurements(26.1f, 39.8f);
    }
}
