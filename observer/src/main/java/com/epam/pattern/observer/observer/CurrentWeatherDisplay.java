package com.epam.pattern.observer.observer;

import com.epam.pattern.observer.observable.Observable;
import com.epam.pattern.observer.observable.WeatherStation;

public class CurrentWeatherDisplay implements Observer {

    private final String channel;

    public CurrentWeatherDisplay(String channel) {
        this.channel = channel;
    }

    @Override
    public void update(Observable observable) {
        if (observable instanceof WeatherStation) {
            displayCurrentWeather((WeatherStation) observable);
        }
    }

    private void displayCurrentWeather(WeatherStation weatherStation) {
        System.out.printf("%s: Temperature is %.1f degrees and humidity is %.1f percentage.%s",
                channel, weatherStation.getTemperature(), weatherStation.getHumidity(), System.lineSeparator());
    }
}
