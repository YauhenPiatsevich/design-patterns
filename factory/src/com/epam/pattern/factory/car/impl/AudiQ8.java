package com.epam.pattern.factory.car.impl;

import com.epam.pattern.factory.car.Car;

public class AudiQ8 implements Car
{
    AudiQ8()
    {
    }

    @Override
    public String getName()
    {
        return "Audi Q8";
    }
}
