package com.epam.pattern.factory.car.impl;

import com.epam.pattern.factory.car.Car;

public class AudiCarFactory {

    private final String carModel;

    public AudiCarFactory(String carModel) {
        this.carModel = carModel;
    }

    public Car createCar() {
        return createCarByCarModel();
        // return createCarByClassName() // Alternative method
    }

    private Car createCarByCarModel() {
        if ("A7".equals(carModel)) {
            return new AudiA7();
        } else if ("Q8".equals(carModel)) {
            return new AudiQ8();
        }
        throw new IllegalStateException("Unknown car model: " + carModel);
    }

    public Car createCarByClassName() {
        try {
            return (Car) Class.forName("com.epam.pattern.factory.car.impl.Audi" + carModel).newInstance();
        } catch (Exception e) {
            throw new IllegalStateException("Unknown car model: " + carModel);
        }
    }
}
