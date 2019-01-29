package com.epam.pattern.templatemethod.computer.constructor.impl;

import com.epam.pattern.templatemethod.computer.Computer;
import com.epam.pattern.templatemethod.computer.constructor.ComputerConstructor;

public class HomeComputerConstrucor extends ComputerConstructor
{
    @Override
    protected void addProcessor(final Computer computer)
    {
        computer.setProcessor("Intel Core i3");
    }

    @Override
    protected void addMemory(final Computer computer)
    {
        computer.setMemory("500 GB");
    }

    @Override
    protected void addGraphicsAdapter(final Computer computer)
    {
        // add nothing
    }
}
