package com.epam.pattern.builder.house.builder;

import com.epam.pattern.builder.house.Elevator;
import com.epam.pattern.builder.house.House;
import com.epam.pattern.builder.house.Parking;
import com.epam.pattern.builder.house.RoofType;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder
{
    private final int floors;
    private final RoofType roof;
    private List<Elevator> elevators;
    private Parking parking;

    public HouseBuilder(int floors, RoofType roof)
    {
        this.floors = floors;
        this.roof = roof;
        this.elevators = new ArrayList<>();
    }

    public HouseBuilder withElevator()
    {
        elevators.add(new Elevator());
        return this;
    }

    public HouseBuilder withElevator(int capacity)
    {
        elevators.add(new Elevator(capacity));
        return this;
    }

    public HouseBuilder withParking(int capacity)
    {
        parking = new Parking(capacity);
        return this;
    }

    public House build()
    {
        House house = new House(floors, roof);
        house.setElevators(elevators);
        house.setParking(parking);
        return house;
    }
}
