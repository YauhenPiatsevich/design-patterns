package com.epam.pattern.mediator;

import com.epam.pattern.mediator.colleague.Colleague;
import com.epam.pattern.mediator.colleague.impl.ColleagueA;
import com.epam.pattern.mediator.colleague.impl.ColleagueB;

public class TwoColleaguesMediator implements Mediator
{
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public void setColleagueA(ColleagueA colleague)
    {
        this.colleagueA = colleague;
    }

    public void setColleagueB(ColleagueB colleague)
    {
        this.colleagueB = colleague;
    }

    @Override
    public void send(String message, Colleague sender)
    {
        if (sender.equals(colleagueB))
        {
            colleagueA.notify(message);
        }
        else
        {
            colleagueB.notify(message);
        }
    }
}
