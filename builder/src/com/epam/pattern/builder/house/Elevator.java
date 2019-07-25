package com.epam.pattern.builder.house;

public class Elevator
{
    private static final int DEFAULT_CAPACITY = 5;

    private final int capacity;

    public Elevator()
    {
        this.capacity = DEFAULT_CAPACITY;
    }

    public Elevator(int capacity)
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
        return "Elevator with capacity: " + capacity;
    }
}
