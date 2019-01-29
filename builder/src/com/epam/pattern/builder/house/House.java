package com.epam.pattern.builder.house;

import java.util.List;

public class House
{
    private int floors;
    private RoofType roof;
    private List<Elevator> elevators;
    private Parking parking;

    public House(final int floors, final RoofType roof)
    {
        this.floors = floors;
        this.roof = roof;
    }

    public int getFloors()
    {
        return floors;
    }

    public void setFloors(final int floors)
    {
        this.floors = floors;
    }

    public RoofType getRoof()
    {
        return roof;
    }

    public void setRoof(final RoofType roof)
    {
        this.roof = roof;
    }

    public List<Elevator> getElevators()
    {
        return elevators;
    }

    public void setElevators(final List<Elevator> elevators)
    {
        this.elevators = elevators;
    }

    public Parking getParking()
    {
        return parking;
    }

    public void setParking(final Parking parking)
    {
        this.parking = parking;
    }

    @Override
    public String toString()
    {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("House with ").append(floors).append(" floors and ").append(roof).append(" roof.");

        if (elevators == null || elevators.isEmpty())
        {
            stringBuilder.append(" There are no elevators.");
        }
        else
        {
            stringBuilder.append(" There is/are ").append(elevators.size()).append(" elevators.");
        }

        if (parking == null)
        {
            stringBuilder.append(" There is no car parking.");
        }
        else
        {
            stringBuilder.append(" There is a car parking for ").append(parking.getCapacity()).append(" cars.");
        }

        return stringBuilder.toString();
    }
}
