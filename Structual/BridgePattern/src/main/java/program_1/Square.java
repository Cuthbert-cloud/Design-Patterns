package program_1;

import java.awt.Graphics;

public abstract class Square extends Shape {
    public void draw(Graphics g) {
        g.fillRect(5,15,50,50);
    }
}
