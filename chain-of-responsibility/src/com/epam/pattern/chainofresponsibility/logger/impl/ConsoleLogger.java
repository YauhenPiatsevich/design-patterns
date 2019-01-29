package com.epam.pattern.chainofresponsibility.logger.impl;

import com.epam.pattern.chainofresponsibility.logger.AbstractLogger;
import com.epam.pattern.chainofresponsibility.logger.LogLevel;

public class ConsoleLogger extends AbstractLogger
{
    public ConsoleLogger(final LogLevel... levels)
    {
        super(levels);
    }

    @Override
    protected void writeLog(final LogLevel level, final String msg)
    {
        System.out.printf("Write to Console. Level: %s. Message: %s\n", level, msg);
    }
}
