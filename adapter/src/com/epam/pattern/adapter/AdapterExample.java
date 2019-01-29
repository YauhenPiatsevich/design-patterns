package com.epam.pattern.adapter;

import com.epam.pattern.adapter.dog.Bulldog;
import com.epam.pattern.adapter.toy.Toy;
import com.epam.pattern.adapter.toy.ToyDuck;

import java.util.ArrayList;
import java.util.List;

public class AdapterExample
{
    public static void main(String[] args)
    {
        List<Toy> toys = new ArrayList<Toy>();
        toys.add(new ToyDuck());
//        toys.add(new Bulldog()); // we can't do this!
        toys.add(new DogToToyAdapter(new Bulldog()));

        for (final Toy toy : toys)
        {
            toy.makeSound();
        }
    }
}
