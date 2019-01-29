package com.epam.pattern.chainofresponsibility.logger.impl;

import com.epam.pattern.chainofresponsibility.logger.AbstractLogger;
import com.epam.pattern.chainofresponsibility.logger.LogLevel;

public class EmailLogger extends AbstractLogger
{
    public EmailLogger(final LogLevel... levels)
    {
        super(levels);
    }

    @Override
    protected void writeLog(final LogLevel level, final String msg)
    {
        System.out.printf("Write to Email. Level: %s. Message: %s\n", level, msg);
    }
}
