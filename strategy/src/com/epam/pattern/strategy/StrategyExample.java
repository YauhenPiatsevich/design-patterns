package com.epam.pattern.strategy;

public class StrategyExample {

    public static void main(String[] args) {
        Strategy addStrategy = getStrategyByName("Add");
        int addResult = addStrategy.execute(2, 6);
        System.out.println("Add strategy result: " + addResult);

        Strategy multiplyStrategy = getStrategyByName("Multiply");
        int multiplyResult = multiplyStrategy.execute(2, 6);
        System.out.println("Multiply strategy result: " + multiplyResult);
    }

    private static Strategy getStrategyByName(String name) {
        try {
            return (Strategy) Class.forName("com.epam.pattern.strategy.impl." + name + "Strategy").newInstance();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
