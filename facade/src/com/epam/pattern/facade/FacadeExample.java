package com.epam.pattern.facade;

import com.epam.pattern.facade.computer.ComputerFacade;
import com.epam.pattern.facade.computer.HomeComputerFacade;

public class FacadeExample
{
    public static void main(String[] args)
    {
        final ComputerFacade computerFacade = new HomeComputerFacade();
        computerFacade.start();
    }
}
