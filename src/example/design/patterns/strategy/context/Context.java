package example.design.patterns.strategy.context;

import example.design.patterns.strategy.ifc.Strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int numberA, int numberB) {
        return strategy.execute(numberA, numberB);
    }
}
