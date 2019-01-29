package com.epam.pattern.mediator.colleague.impl;

import com.epam.pattern.mediator.Mediator;

public class ColleagueB extends AbstractColleague
{
    public ColleagueB(final Mediator mediator)
    {
        super(mediator);
    }

    @Override
    public void notify(final String message)
    {
        System.out.println("Colleague B gets message: " + message);
    }
}
