package com.epam.pattern.strategy.impl;

import com.epam.pattern.strategy.Strategy;

public class MultiplyStrategy implements Strategy
{
    @Override
    public int execute(final int a, final int b)
    {
        return a * b;
    }
}
