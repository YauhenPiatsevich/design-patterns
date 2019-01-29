package com.epam.pattern.adapter.dog;

public class Bulldog implements Dog
{
    @Override
    public void bark()
    {
        System.out.println("Arf-arf");
    }
}
