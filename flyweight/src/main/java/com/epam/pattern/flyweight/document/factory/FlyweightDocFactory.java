package com.epam.pattern.flyweight.document.factory;

import com.epam.pattern.flyweight.document.Document;
import com.epam.pattern.flyweight.document.impl.DocumentA;
import com.epam.pattern.flyweight.document.impl.DocumentB;
import com.epam.pattern.flyweight.document.impl.DocumentC;

import java.util.HashMap;
import java.util.Map;

public class FlyweightDocFactory {

    private Map<Integer, Document> cache = new HashMap<>();

    public Document getDocument(Integer number) {
        Document document = cache.get(number);
        if (document == null) {
            switch (number) {
                case 1:
                    document = new DocumentA();
                    break;
                case 2:
                    document = new DocumentB();
                    break;
                case 3:
                    document = new DocumentC();
                    break;
            }
            cache.put(number, document);
        }
        return document;
    }
}
