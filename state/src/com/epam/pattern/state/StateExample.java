package com.epam.pattern.state;

import com.epam.pattern.state.water.Water;
import com.epam.pattern.state.water.impl.SolidState;

public class StateExample {

    public static void main(String[] args) {
        Water water = new Water(new SolidState());
        water.heat();
        water.heat();
        water.heat();
        water.freeze();
        water.freeze();
        water.freeze();
    }
}
