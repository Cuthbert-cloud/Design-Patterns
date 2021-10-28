package program_1;

import java.awt.Graphics;
import java.awt.Color;

public class BlueSquare extends Square {
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        super.draw(g);
    }
}
