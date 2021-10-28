package program_1;

import java.awt.Graphics;
import java.awt.Color;

public class GreenCircle extends Circle {
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        super.draw(g);
    }
}
