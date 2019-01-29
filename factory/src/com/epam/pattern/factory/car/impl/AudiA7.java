package com.epam.pattern.factory.car.impl;

import com.epam.pattern.factory.car.Car;

public class AudiA7 implements Car
{
    AudiA7()
    {
    }

    @Override
    public String getName()
    {
        return "Audi A7";
    }
}
