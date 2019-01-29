package com.epam.pattern.interpreter.expression.impl;

import com.epam.pattern.interpreter.expression.Expression;
import com.epam.pattern.interpreter.Context;

public class AddExpression implements Expression
{
    private final Expression expr1;
    private final Expression expr2;

    public AddExpression(final Expression expr1, final Expression expr2)
    {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public int interpret(final Context ctx)
    {
        return expr1.interpret(ctx) + expr2.interpret(ctx);
    }
}
