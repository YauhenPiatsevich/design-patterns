package com.epam.pattern.state.water.impl;

import com.epam.pattern.state.water.State;
import com.epam.pattern.state.water.Water;

public class LiquidState implements State {

    @Override
    public String getName() {
        return "liquid";
    }

    @Override
    public void freeze(Water water) {
        water.setState(new SolidState());
    }

    @Override
    public void heat(Water water) {
        water.setState(new GaseousState());
    }
}
