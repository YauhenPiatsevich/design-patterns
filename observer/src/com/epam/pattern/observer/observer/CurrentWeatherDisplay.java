package com.epam.pattern.observer.observer;

import com.epam.pattern.observer.observable.Observable;
import com.epam.pattern.observer.observable.WeatherStation;

public class CurrentWeatherDisplay implements Observer
{
    private final String channel;

    public CurrentWeatherDisplay(final String channel)
    {
        this.channel = channel;
    }

    @Override
    public void update(final Observable observable)
    {
        if (observable instanceof WeatherStation)
        {
            displayCurrentWeather((WeatherStation) observable);
        }
    }

    private void displayCurrentWeather(final WeatherStation weatherStation)
    {
        System.out.printf("%s: Temperature is %.1f degrees and humidity is %.1f percentage.\n",
                channel, weatherStation.getTemperature(), weatherStation.getHumidity());
    }
}
