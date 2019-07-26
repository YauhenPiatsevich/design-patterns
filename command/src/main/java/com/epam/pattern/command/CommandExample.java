package com.epam.pattern.command;

import com.epam.pattern.command.light.RemoteControl;
import com.epam.pattern.command.light.WirelessLight;
import com.epam.pattern.command.light.command.impl.TurnOffLightCommand;
import com.epam.pattern.command.light.command.impl.TurnOnLightCommand;

public class CommandExample {

    public static void main(String[] args) {
        WirelessLight light = new WirelessLight();

        directMethodInvocation(light);
        methodInvocationUsingCommand(light);
    }

    private static void directMethodInvocation(WirelessLight light) {
        System.out.println("Direct method invocation");

        light.turnOn();
        light.turnOff();
    }

    private static void methodInvocationUsingCommand(WirelessLight light) {
        System.out.println("Method invocation using command");

        RemoteControl control = new RemoteControl(
                new TurnOnLightCommand(light),
                new TurnOffLightCommand(light)
        );

        control.lightUp();
        control.lightDown();
    }
}
