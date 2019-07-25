package com.epam.pattern.interpreter.expression;

import com.epam.pattern.interpreter.expression.impl.AddExpression;
import com.epam.pattern.interpreter.expression.impl.MultiplyExpression;
import com.epam.pattern.interpreter.expression.impl.NumberExpression;

import java.util.Stack;

public class ExpressionParser {

    private static final String DELIMITER = " ";
    private static final String SUM = "+";
    private static final String MULT = "*";

    public static Expression parse(String stringExpression) {
        Stack<Expression> stack = new Stack<>();

        for (String element : stringExpression.split(DELIMITER)) {
            if (SUM.equals(element)) {
                Expression expr1 = stack.pop();
                Expression expr2 = stack.pop();
                stack.push(new AddExpression(expr1, expr2));
            } else if (MULT.equals(element)) {
                Expression expr1 = stack.pop();
                Expression expr2 = stack.pop();
                stack.push(new MultiplyExpression(expr1, expr2));
            } else {
                stack.push(new NumberExpression(element));
            }
        }
        return stack.peek();
    }
}
