package com.epam.pattern.interpreter;

import com.epam.pattern.interpreter.expression.Expression;
import com.epam.pattern.interpreter.expression.ExpressionParser;

public class InterpreterExample
{
    public static void main(String[] args)
    {
        final Context ctx = new Context();
        final String stringExpression = "a b + c *"; // (a + b) * c

        final Expression expression = ExpressionParser.parse(stringExpression);
        final int result = expression.interpret(ctx);

        System.out.printf("(%s) = %s", stringExpression, result);
    }
}

//         ( a )   ( b )
//            \     /
//             ( + )   ( c )
//                \     /
//                 ( * )
