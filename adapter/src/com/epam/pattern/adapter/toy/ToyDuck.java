package com.epam.pattern.adapter.toy;

public class ToyDuck implements Toy
{
    @Override
    public void makeSound()
    {
        System.out.println("Squeak");
    }
}
