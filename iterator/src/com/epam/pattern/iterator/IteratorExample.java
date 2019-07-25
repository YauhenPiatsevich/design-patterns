package com.epam.pattern.iterator;

import java.util.Arrays;

public class IteratorExample {

    public static void main(String[] args) {
        Collection collection = new Collection(Arrays.asList(1, 2, 3, 4, 5));
        Iterator iterator = collection.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
