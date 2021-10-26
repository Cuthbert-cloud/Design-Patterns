package tdd.strategy;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getScore() {
        return strategy.score();
    }
}
