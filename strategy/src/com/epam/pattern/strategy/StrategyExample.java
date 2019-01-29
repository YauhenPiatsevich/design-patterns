package com.epam.pattern.strategy;

public class StrategyExample
{
    public static void main(String[] args)
    {
        final Strategy addStrategy = getStrategyByName("Add");
        final int addResult = addStrategy.execute(2, 6);
        System.out.println("Add strategy result: " + addResult);

        final Strategy multiplyStrategy = getStrategyByName("Multiply");
        final int multiplyResult = multiplyStrategy.execute(2, 6);
        System.out.println("Multiply strategy result: " + multiplyResult);
    }

    private static Strategy getStrategyByName(final String name)
    {
        try
        {
            return (Strategy) Class.forName("com.epam.pattern.strategy.impl." + name + "Strategy").newInstance();
        }
        catch (final Exception e)
        {
            throw new IllegalStateException(e);
        }
    }
}
