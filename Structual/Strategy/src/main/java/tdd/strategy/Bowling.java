package tdd.strategy;

public class Bowling implements Strategy {

    private final int[] rolls;
    private int frameStart;
    private int totalScore;

    public Bowling(int[] roll) {
        this.rolls = roll;
        this.frameStart = 0;
        this.totalScore = 0;
    }

    public int rollSum(int count) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += this.rolls[frameStart + i];
        }
        return total;
    }

    public boolean isSpare() {
        return this.rolls[frameStart] + this.rolls[frameStart + 1] == 10;
    }

    public boolean isStrike() {
        return this.rolls[frameStart] == 10;
    }

    public void updateFrameStart() {
        if (this.isStrike()) {
            frameStart++;
        } else {
            frameStart += 2;
        }
    }

    public int scoreIncrement() {
        if (this.isStrike()) {
            return this.rollSum(3);
        } else if (this.isSpare()) {
            return this.rollSum(3);
        } else {
            return this.rollSum(2);
        }
    }

    public void updateScore() {
        this.totalScore += this.scoreIncrement();
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public int score() {
        for (int frame = 1; frame <= 10; frame++) {
            this.updateScore();
            this.updateFrameStart();
        }
        return this.getTotalScore();
    }
}
