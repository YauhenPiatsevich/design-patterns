package com.epam.pattern.mediator.colleague.impl;

import com.epam.pattern.mediator.Mediator;
import com.epam.pattern.mediator.colleague.Colleague;

public abstract class AbstractColleague implements Colleague
{
    private final Mediator mediator;

    public AbstractColleague(final Mediator mediator)
    {
        this.mediator = mediator;
    }

    public void send(final String message)
    {
        mediator.send(message, this);
    }
}
