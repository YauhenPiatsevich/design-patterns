package com.epam.pattern.state.water;

public interface State {

    String getName();

    void freeze(Water water);

    void heat(Water water);
}
