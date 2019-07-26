package com.epam.pattern.interpreter.expression.impl;

import com.epam.pattern.interpreter.expression.Expression;
import com.epam.pattern.interpreter.Context;

public class NumberExpression implements Expression // Terminal expression
{
    private final String variable;

    public NumberExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Context ctx) {
        return ctx.getValue(variable);
    }
}
