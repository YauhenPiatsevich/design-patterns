package com.epam.pattern.mediator;

import com.epam.pattern.mediator.colleague.impl.ColleagueA;
import com.epam.pattern.mediator.colleague.impl.ColleagueB;

public class MediatorExample {

    public static void main(String[] args) {
        TwoColleaguesMediator mediator = new TwoColleaguesMediator();

        ColleagueA colleagueA = new ColleagueA(mediator);
        ColleagueB colleagueB = new ColleagueB(mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.send("How are you?");
        colleagueB.send("I'm fine, thanks!");
    }
}
