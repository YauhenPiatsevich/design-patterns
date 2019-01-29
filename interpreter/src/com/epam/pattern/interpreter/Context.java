package com.epam.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context
{
    private final Map<String, Integer> map;

    public Context()
    {
        map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
    }
    
    public int getValue(final String key)
    {
        return map.get(key);
    }
}
