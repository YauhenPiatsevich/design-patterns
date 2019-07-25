package com.epam.pattern.mediator.colleague.impl;

import com.epam.pattern.mediator.Mediator;

public class ColleagueB extends AbstractColleague {

    public ColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague B gets message: " + message);
    }
}
