package com.epam.pattern.interpreter.expression;

import com.epam.pattern.interpreter.Context;

public interface Expression {

    int interpret(Context ctx);
}
