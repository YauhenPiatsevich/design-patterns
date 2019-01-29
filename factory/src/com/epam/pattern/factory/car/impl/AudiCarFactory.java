package com.epam.pattern.factory.car.impl;

import com.epam.pattern.factory.car.Car;

public class AudiCarFactory
{
    private final String carModel;

    public AudiCarFactory(final String carModel)
    {
        this.carModel = carModel;
    }

    public Car createCar()
    {
        if ("A7".equals(carModel))
        {
            return new AudiA7();
        }
        else if ("Q8".equals(carModel))
        {
            return new AudiQ8();
        }
        throw new IllegalStateException("Unknown car model: " + carModel);

        // alternative method createCarByClassName()
    }

    public Car createCarByClassName()
    {
        try
        {
            return (Car) Class.forName("com.epam.pattern.factory.car.impl.Audi" + carModel).newInstance();
        }
        catch (final Exception e)
        {
            throw new IllegalStateException("Unknown car model: " + carModel);
        }
    }
}
