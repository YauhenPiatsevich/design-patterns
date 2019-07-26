package com.epam.pattern.templatemethod.computer.constructor;

import com.epam.pattern.templatemethod.computer.Computer;

public abstract class ComputerConstructor {

    public final Computer constructComputer() {
        Computer computer = new Computer();
        addProcessor(computer);
        addMemory(computer);
        addGraphicsAdapter(computer);
        return computer;
    }

    protected abstract void addProcessor(Computer computer);

    protected abstract void addMemory(Computer computer);

    protected abstract void addGraphicsAdapter(Computer computer);
}
