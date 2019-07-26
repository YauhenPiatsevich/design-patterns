package com.epam.pattern.chainofresponsibility.logger.impl;

import com.epam.pattern.chainofresponsibility.logger.AbstractLogger;
import com.epam.pattern.chainofresponsibility.logger.LogLevel;

public class EmailLogger extends AbstractLogger {

    public EmailLogger(LogLevel... levels) {
        super(levels);
    }

    @Override
    protected void writeLog(LogLevel level, String msg) {
        System.out.printf("Write to Email. Level: %s. Message: %s%s", level, msg, System.lineSeparator());
    }
}
