package com.epam.pattern.mediator.colleague.impl;

import com.epam.pattern.mediator.Mediator;

public class ColleagueA extends AbstractColleague {

    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague A gets message: " + message);
    }
}
