package com.epam.pattern.decorator.command.light;

import com.epam.pattern.decorator.command.light.command.Command;

public class RemoteControl
{
    private final Command lightUpCommand;
    private final Command lightDownCommand;

    public RemoteControl(final Command lightUpCommand, final Command lightDownCommand)
    {
        this.lightUpCommand = lightUpCommand;
        this.lightDownCommand = lightDownCommand;
    }

    public void lightUp()
    {
        lightUpCommand.execute();
    }

    public void lightDown()
    {
        lightDownCommand.execute();
    }
}
