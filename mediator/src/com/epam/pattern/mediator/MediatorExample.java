package com.epam.pattern.mediator;

import com.epam.pattern.mediator.colleague.impl.ColleagueA;
import com.epam.pattern.mediator.colleague.impl.ColleagueB;

public class MediatorExample
{
    public static void main(String[] args)
    {
        final TwoColleaguesMediator mediator = new TwoColleaguesMediator();

        final ColleagueA colleagueA = new ColleagueA(mediator);
        final ColleagueB colleagueB = new ColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        mediator.send("How are you?", colleagueA);
        mediator.send("Fine, thanks", colleagueB);
    }
}
