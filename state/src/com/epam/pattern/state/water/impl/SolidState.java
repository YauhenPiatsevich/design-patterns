package com.epam.pattern.state.water.impl;

import com.epam.pattern.state.water.State;
import com.epam.pattern.state.water.Water;

public class SolidState implements State
{
    @Override
    public String getName()
    {
        return "solid";
    }

    @Override
    public void freeze(final Water water)
    {
        System.out.println("Nothing happens.");
    }

    @Override
    public void heat(final Water water)
    {
        water.setState(new LiquidState());
    }
}
