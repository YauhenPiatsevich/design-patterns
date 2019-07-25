package com.epam.pattern.interpreter;

import com.epam.pattern.interpreter.expression.Expression;
import com.epam.pattern.interpreter.expression.ExpressionParser;

public class InterpreterExample {

    public static void main(String[] args) {
        Context ctx = new Context();
        String stringExpression = "a b + c *"; // (a + b) * c

        Expression expression = ExpressionParser.parse(stringExpression);
        int result = expression.interpret(ctx);

        System.out.printf("(%s) = %s", stringExpression, result);
    }
}

// Tree example:
//
//         ( a )   ( b )
//            \     /
//             ( + )   ( c )
//                \     /
//                 ( * )
