package com.epam.pattern.flyweight;

import com.epam.pattern.flyweight.document.Document;
import com.epam.pattern.flyweight.document.factory.FlyweightDocFactory;

import java.util.Arrays;
import java.util.List;

public class FlyweightExample {

    public static void main(String[] args) {
        FlyweightDocFactory factory = new FlyweightDocFactory();

        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 3, 1);
        for (Integer number : numbers) {
            Document document = factory.getDocument(number);
            System.out.println(document.read());
        }
    }
}
