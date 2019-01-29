package com.epam.pattern.chainofresponsibility.logger;

public enum LogLevel
{
    INFO, DEBUG, WARNING, ERROR;

    public static LogLevel[] ALL()
    {
        return values();
    }
}
