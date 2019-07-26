package com.epam.pattern.state.water.impl;

import com.epam.pattern.state.water.State;
import com.epam.pattern.state.water.Water;

public class SolidState implements State {

    @Override
    public String getName() {
        return "solid";
    }

    @Override
    public void freeze(Water water) {
        System.out.println("Nothing happens.");
    }

    @Override
    public void heat(Water water) {
        water.setState(new LiquidState());
    }
}
