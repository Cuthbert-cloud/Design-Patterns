package tdd.strategy;

public interface Strategy {
    int rollSum(int count);
    boolean isSpare();
    boolean isStrike();
    void updateFrameStart();
    int scoreIncrement();
    void updateScore();
    int getTotalScore();
    int score();
}
