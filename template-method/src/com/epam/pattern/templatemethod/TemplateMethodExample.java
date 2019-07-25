package com.epam.pattern.templatemethod;

import com.epam.pattern.templatemethod.computer.Computer;
import com.epam.pattern.templatemethod.computer.constructor.impl.HomeComputerConstructor;
import com.epam.pattern.templatemethod.computer.constructor.impl.ProfessionalComputerConstructor;

public class TemplateMethodExample {

    public static void main(String[] args) {
        Computer professionalComputer = new ProfessionalComputerConstructor().constructComputer();
        System.out.println(professionalComputer);

        Computer homeComputer = new HomeComputerConstructor().constructComputer();
        System.out.println(homeComputer);
    }
}
