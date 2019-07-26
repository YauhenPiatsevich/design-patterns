package com.epam.pattern.command.light;

import com.epam.pattern.command.light.command.Command;

public class RemoteControl {

    private final Command lightUpCommand;
    private final Command lightDownCommand;

    public RemoteControl(Command lightUpCommand, Command lightDownCommand) {
        this.lightUpCommand = lightUpCommand;
        this.lightDownCommand = lightDownCommand;
    }

    public void lightUp() {
        lightUpCommand.execute();
    }

    public void lightDown() {
        lightDownCommand.execute();
    }
}
