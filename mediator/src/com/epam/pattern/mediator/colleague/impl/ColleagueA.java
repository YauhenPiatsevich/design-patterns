package com.epam.pattern.mediator.colleague.impl;

import com.epam.pattern.mediator.Mediator;

public class ColleagueA extends AbstractColleague
{
    public ColleagueA(final Mediator mediator)
    {
        super(mediator);
    }

    @Override
    public void notify(final String message)
    {
        System.out.println("Colleague A gets message: " + message);
    }
}
