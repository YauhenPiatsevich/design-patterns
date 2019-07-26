package com.epam.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private final Map<String, Integer> map;

    public Context() {
        map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
    }

    public int getValue(String key) {
        return map.get(key);
    }
}
