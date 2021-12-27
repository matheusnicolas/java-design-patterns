package example.design.patterns.strategy.concrete;

import example.design.patterns.strategy.ifc.Strategy;

public class ConcreteStrategyMultiply implements Strategy {

    @Override
    public int execute(int numberA, int numberB) {
        return numberA * numberB;
    }

}
