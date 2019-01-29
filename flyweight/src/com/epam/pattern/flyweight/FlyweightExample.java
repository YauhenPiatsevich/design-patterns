package com.epam.pattern.flyweight;

import com.epam.pattern.flyweight.document.Document;
import com.epam.pattern.flyweight.document.factory.FlyweightDocFactory;

import java.util.Arrays;
import java.util.List;

public class FlyweightExample
{
    public static void main(String[] args)
    {
        final FlyweightDocFactory factory = new FlyweightDocFactory();

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 3, 1);
        for (final Integer number : numbers)
        {
            final Document document = factory.getDocument(number);
            System.out.println(document.read());
        }
    }
}
