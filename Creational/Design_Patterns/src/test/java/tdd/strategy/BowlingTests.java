package tdd.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingTests {

    @Test
    void Balls() {
        int[] roll = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Bowling bowling = new Bowling(roll);
        Assertions.assertEquals(0, bowling.score());
    }

    @Test
    void openFrames() {
        int[] roll = {0,0,5,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Bowling bowling = new Bowling(roll);
        Assertions.assertEquals(9, bowling.score());
    }

    @Test
    void spares() {
        int[] roll = {0,0, 5,4, 6,4, 1,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
        Bowling bowling = new Bowling(roll);
        Assertions.assertEquals(24, bowling.score());
    }

    @Test
    void strike() {
        int[] roll = {0,0, 5,4, 0,0, 10, 1,3, 0,0, 0,0, 0,0, 0,0, 0,0};
        Bowling bowling = new Bowling(roll);
        Assertions.assertEquals(27, bowling.score());
    }

    @Test
    void perfectScore() {
        int[] roll = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        Bowling bowling = new Bowling(roll);
        Assertions.assertEquals(300, bowling.score());
    }

    @Test
    void alternating_strike_spare_200() {
        int[] roll = {6,4, 10, 6,4, 10, 6,4, 10, 6,4, 10, 6,4, 10, 6,4};
        Bowling bowling = new Bowling(roll);
        Assertions.assertEquals(200, bowling.score());
    }
}
