package com.epam.pattern.state.water.impl;

import com.epam.pattern.state.water.State;
import com.epam.pattern.state.water.Water;

public class GaseousState implements State
{
    @Override
    public String getName()
    {
        return "gaseous";
    }

    @Override
    public void freeze(final Water water)
    {
        water.setState(new LiquidState());
    }

    @Override
    public void heat(final Water water)
    {
        System.out.println("Nothing happens.");
    }
}
