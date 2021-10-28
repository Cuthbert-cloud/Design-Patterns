package program_2;

import java.awt.Graphics;

public class Circle extends Shape {

    ColorShape colorShape;

    public Circle(ColorShape colorShape) {
        this.colorShape = colorShape;
    }

    @Override
    public void draw(Graphics g) {
        this.colorShape.setColor(g);
        g.fillOval(75,15,50,50);
    }
}
