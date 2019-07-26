package com.epam.pattern.factory;

import com.epam.pattern.factory.car.Car;
import com.epam.pattern.factory.car.impl.AudiCarFactory;

public class FactoryExample {

    public static void main(String[] args) {
        // Car firstCar = new AudiA7(); // Has package-private constructor
        // Car secondCar = new AudiQ8(); // Hsa package-private constructor

        Car firstCar = new AudiCarFactory("A7").createCar();
        Car secondCar = new AudiCarFactory("Q8").createCar();

        System.out.println("First car name: " + firstCar.getName());
        System.out.println("Second car name: " + secondCar.getName());
    }
}
