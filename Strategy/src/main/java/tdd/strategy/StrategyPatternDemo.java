package tdd.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        int[] rolls_1 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        Context context_1 = new Context(new Bowling(rolls_1));
        System.out.println(context_1.getScore());

        int[] roll_2 = {6,4, 10, 6,4, 10, 6,4, 10, 6,4, 10, 6,4, 10, 6,4};
        Context context_2 = new Context(new Bowling(roll_2));
        System.out.println(context_2.getScore());
    }
}
