package com.epam.pattern.interpreter.expression;

import com.epam.pattern.interpreter.expression.impl.AddExpression;
import com.epam.pattern.interpreter.expression.impl.MultiplyExpression;
import com.epam.pattern.interpreter.expression.impl.NumberExpression;

import java.util.Stack;

public class ExpressionParser
{
    public static Expression parse(final String stringExpression)
    {
        final Stack<Expression> stack = new Stack<Expression>();

        for (final String element : stringExpression.split(" "))
        {
            if ("+".equals(element))
            {
                final Expression expr1 = stack.pop();
                final Expression expr2 = stack.pop();
                stack.push(new AddExpression(expr1, expr2));
            }
            else if ("*".equals(element))
            {
                final Expression expr1 = stack.pop();
                final Expression expr2 = stack.pop();
                stack.push(new MultiplyExpression(expr1, expr2));
            }
            else
            {
                stack.push(new NumberExpression(element));
            }
        }
        return stack.peek();
    }
}
