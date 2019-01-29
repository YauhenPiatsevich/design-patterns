package com.epam.pattern.templatemethod;

import com.epam.pattern.templatemethod.computer.Computer;
import com.epam.pattern.templatemethod.computer.constructor.impl.HomeComputerConstrucor;
import com.epam.pattern.templatemethod.computer.constructor.impl.ProfessionalComputerConstrucor;

public class TemplateMethodExample
{
    public static void main(String[] args)
    {
        final Computer professionalComputer = new ProfessionalComputerConstrucor().constructComputer();
        System.out.println(professionalComputer);

        final Computer homeComputer = new HomeComputerConstrucor().constructComputer();
        System.out.println(homeComputer);
    }
}
