package com.epam.pattern.command.light.command.impl;

import com.epam.pattern.command.light.WirelessLight;
import com.epam.pattern.command.light.command.Command;

public class TurnOffLightCommand implements Command {

    private final WirelessLight light;

    public TurnOffLightCommand(WirelessLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
