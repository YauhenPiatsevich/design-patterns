package com.epam.pattern.builder;

import com.epam.pattern.builder.house.Elevator;
import com.epam.pattern.builder.house.House;
import com.epam.pattern.builder.house.Parking;
import com.epam.pattern.builder.house.RoofType;
import com.epam.pattern.builder.house.builder.HouseBuilder;

import java.util.ArrayList;

public class BuilderExample {

    public static void main(String[] args) {
        House houseA = new House(9, RoofType.FLAT);
        Elevator elevatorForHouseA = new Elevator();
        ArrayList<Elevator> elevators = new ArrayList<>();
        elevators.add(elevatorForHouseA);
        houseA.setElevators(elevators);
        houseA.setParking(new Parking(15));

        System.out.println("House A:" + houseA);

        House houseB = new HouseBuilder(18, RoofType.BONNET)
                .withElevator().withElevator(10).withParking(30).build();

        System.out.println("House B:" + houseB);
    }
}
