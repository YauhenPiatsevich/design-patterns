package com.epam.pattern.chainofresponsibility.logger.impl;

import com.epam.pattern.chainofresponsibility.logger.AbstractLogger;
import com.epam.pattern.chainofresponsibility.logger.LogLevel;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(LogLevel... levels) {
        super(levels);
    }

    @Override
    protected void writeLog(LogLevel level, String msg) {
        System.out.printf("Write to Console. Level: %s. Message: %s%s", level, msg, System.lineSeparator());
    }
}
