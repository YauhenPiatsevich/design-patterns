package com.epam.pattern.mediator;

import com.epam.pattern.mediator.colleague.Colleague;

public interface Mediator
{
    void send(String message, Colleague sender);
}
