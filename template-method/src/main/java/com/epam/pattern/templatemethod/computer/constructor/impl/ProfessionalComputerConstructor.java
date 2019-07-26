package com.epam.pattern.templatemethod.computer.constructor.impl;

import com.epam.pattern.templatemethod.computer.Computer;
import com.epam.pattern.templatemethod.computer.constructor.ComputerConstructor;

public class ProfessionalComputerConstructor extends ComputerConstructor {

    @Override
    protected void addProcessor(Computer computer) {
        computer.setProcessor("Intel Core i7 last gen");
    }

    @Override
    protected void addMemory(Computer computer) {
        computer.setMemory("10+ TB");
    }

    @Override
    protected void addGraphicsAdapter(Computer computer) {
        computer.setGraphicsAdapter("GeForce XXX");
    }
}
