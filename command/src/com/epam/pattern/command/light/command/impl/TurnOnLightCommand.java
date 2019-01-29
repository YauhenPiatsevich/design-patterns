package com.epam.pattern.decorator.command.light.command.impl;

import com.epam.pattern.decorator.command.light.WirelessLight;
import com.epam.pattern.decorator.command.light.command.Command;

public class TurnOnLightCommand implements Command
{
    private final WirelessLight light;

    public TurnOnLightCommand(final WirelessLight light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.turnOn();
    }
}
