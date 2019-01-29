package com.epam.pattern.templatemethod.computer.constructor.impl;

import com.epam.pattern.templatemethod.computer.Computer;
import com.epam.pattern.templatemethod.computer.constructor.ComputerConstructor;

public class ProfessionalComputerConstrucor extends ComputerConstructor
{
    @Override
    protected void addProcessor(final Computer computer)
    {
        computer.setProcessor("Intel Core i7 last gen");
    }

    @Override
    protected void addMemory(final Computer computer)
    {
        computer.setMemory("10+ TB");
    }

    @Override
    protected void addGraphicsAdapter(final Computer computer)
    {
        computer.setGraphicsAdapter("GeForce XXX");
    }
}
