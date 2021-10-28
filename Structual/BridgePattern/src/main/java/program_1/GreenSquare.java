package program_1;

import java.awt.Graphics;
import java.awt.Color;

public class GreenSquare extends Square {
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        super.draw(g);
    }
}
