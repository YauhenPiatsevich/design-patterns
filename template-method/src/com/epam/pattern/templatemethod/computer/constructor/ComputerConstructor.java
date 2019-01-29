package com.epam.pattern.templatemethod.computer.constructor;

import com.epam.pattern.templatemethod.computer.Computer;

public abstract class ComputerConstructor
{
    public Computer constructComputer()
    {
        final Computer computer = new Computer();
        addProcessor(computer);
        addMemory(computer);
        addGraphicsAdapter(computer);
        return computer;
    }

    protected abstract void addProcessor(final Computer computer);

    protected abstract void addMemory(final Computer computer);

    protected abstract void addGraphicsAdapter(final Computer computer);
}
