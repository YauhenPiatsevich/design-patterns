package com.epam.pattern.chainofresponsibility;

import com.epam.pattern.chainofresponsibility.logger.AbstractLogger;
import com.epam.pattern.chainofresponsibility.logger.impl.ConsoleLogger;
import com.epam.pattern.chainofresponsibility.logger.impl.EmailLogger;
import com.epam.pattern.chainofresponsibility.logger.impl.FileLogger;
import com.epam.pattern.chainofresponsibility.logger.LogLevel;

public class ChainOfResponsibilityExample
{
    public static void main(String[] args)
    {
        AbstractLogger logger = new ConsoleLogger(LogLevel.INFO, LogLevel.WARNING, LogLevel.ERROR);

        logger.setNext(new EmailLogger(LogLevel.ERROR))
                .setNext(new FileLogger(LogLevel.ALL()));

        logger.log(LogLevel.INFO, "Server started");
        logger.log(LogLevel.DEBUG, "Too many DB connections was detected");
        logger.log(LogLevel.WARNING, "Could not connect to the DB first time");
        logger.log(LogLevel.ERROR, "Server crashed");
    }
}
