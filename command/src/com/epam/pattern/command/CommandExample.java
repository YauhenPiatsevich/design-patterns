package com.epam.pattern.decorator.command;

import com.epam.pattern.decorator.command.light.RemoteControl;
import com.epam.pattern.decorator.command.light.WirelessLight;
import com.epam.pattern.decorator.command.light.command.impl.TurnOffLightCommand;
import com.epam.pattern.decorator.command.light.command.impl.TurnOnLightCommand;

public class CommandExample
{
    public static void main(String[] args)
    {
        WirelessLight light = new WirelessLight();

//        light.turnOn();
//        light.turnOff();

        RemoteControl control = new RemoteControl(
                new TurnOnLightCommand(light),
                new TurnOffLightCommand(light)
        );

        control.lightUp();
        control.lightDown();
    }
}
