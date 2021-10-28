package program_1;

import java.awt.Graphics;

public abstract class Circle extends Shape {
    public void draw(Graphics g) {
        g.fillOval(75,15,50,50);
    }
}
