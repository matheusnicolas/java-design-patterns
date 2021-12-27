package example.design.patterns.strategy;

import example.design.patterns.strategy.concrete.ConcreteStrategyMultiply;
import example.design.patterns.strategy.concrete.ConcreteStrategySubtract;
import example.design.patterns.strategy.concrete.ConcreteStrategySum;
import example.design.patterns.strategy.context.Context;

import java.util.*;

public class Main {

    private static final String MULTIPLY = "MULTIPLY";
    private static final String SUBTRACT = "SUBTRACT";
    private static final String SUM = "SUM";

    public static void main(String[] args) {

        Context context = new Context();

        Map<String, String> arithmeticDictionary = new HashMap<String, String>() {{
            put("1", SUM);
            put("2", SUBTRACT);
            put("3", MULTIPLY);
        }};

        int numberA = 10;
        int numberB = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - SUM\n" +
                "2 - SUBTRACT \n" +
                "3 - MULTIPLY\n\n" +
                "Input a value (1, 2 or 3): ");

        String action = arithmeticDictionary.get(scanner.nextLine());

        if (action.equalsIgnoreCase(SUM)) {
            context.setStrategy(new ConcreteStrategySum());
        } else if (action.equalsIgnoreCase(MULTIPLY)) {
            context.setStrategy(new ConcreteStrategyMultiply());
        } else if (action.equalsIgnoreCase(SUBTRACT)) {
            context.setStrategy(new ConcreteStrategySubtract());
        }

        System.out.println("RESULT: " + context.executeStrategy(numberA, numberB));
    }
}
