package com.epam.pattern.chainofresponsibility.logger;

public abstract class AbstractLogger {

    private final LogLevel[] levels;
    private AbstractLogger next;

    public AbstractLogger(LogLevel... levels) {
        this.levels = levels;
    }

    public AbstractLogger setNext(AbstractLogger logger) {
        this.next = logger;
        return logger;
    }

    public void log(LogLevel level, String msg) {
        for (LogLevel logLevel : levels) {
            if (logLevel.equals(level)) {
                writeLog(level, msg);
            }
        }
        if (next != null) {
            next.log(level, msg);
        }
    }

    protected abstract void writeLog(LogLevel level, String msg);
}
