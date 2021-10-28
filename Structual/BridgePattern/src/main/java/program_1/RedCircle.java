package program_1;

import java.awt.Graphics;
import java.awt.Color;

public class RedCircle extends Circle {
    public void draw(Graphics g) {
        g.setColor(Color.RED);
        super.draw(g);
    }
}
