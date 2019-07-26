package com.epam.pattern.state.water;

public class Water {

    private State state;

    public Water(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.println("Changing state to " + state.getName() + "...");
        this.state = state;
    }

    public void freeze() {
        System.out.println("Freezing " + state.getName() + " substance...");
        state.freeze(this);
    }

    public void heat() {
        System.out.println("Heating " + state.getName() + " substance...");
        state.heat(this);
    }
}
