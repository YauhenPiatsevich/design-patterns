package com.epam.pattern.templatemethod.computer.constructor.impl;

import com.epam.pattern.templatemethod.computer.Computer;
import com.epam.pattern.templatemethod.computer.constructor.ComputerConstructor;

public class HomeComputerConstructor extends ComputerConstructor {

    @Override
    protected void addProcessor(Computer computer) {
        computer.setProcessor("Intel Core i3");
    }

    @Override
    protected void addMemory(Computer computer) {
        computer.setMemory("500 GB");
    }

    @Override
    protected void addGraphicsAdapter(Computer computer) {
        // add nothing
    }
}
