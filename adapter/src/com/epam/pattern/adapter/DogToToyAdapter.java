package com.epam.pattern.adapter;

import com.epam.pattern.adapter.dog.Dog;
import com.epam.pattern.adapter.toy.Toy;

public class DogToToyAdapter implements Toy
{
    private final Dog dog;

    public DogToToyAdapter(Dog dog)
    {
        this.dog = dog;
    }

    @Override
    public void makeSound()
    {
        dog.bark();
    }
}
