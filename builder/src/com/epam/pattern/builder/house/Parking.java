package com.epam.pattern.builder.house;

public class Parking
{
    private final int capacity;

    public Parking(final int capacity)
    {
        this.capacity = capacity;
    }

    public int getCapacity()
    {
        return capacity;
    }

    @Override
    public String toString()
    {
        return "Car parking with capacity: " + capacity;
    }
}
