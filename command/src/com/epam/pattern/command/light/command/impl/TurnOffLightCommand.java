package com.epam.pattern.decorator.command.light.command.impl;

import com.epam.pattern.decorator.command.light.WirelessLight;
import com.epam.pattern.decorator.command.light.command.Command;

public class TurnOffLightCommand implements Command
{
    private final WirelessLight light;

    public TurnOffLightCommand(final WirelessLight light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.turnOff();
    }
}
