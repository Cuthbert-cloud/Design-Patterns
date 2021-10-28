package program_2;

import java.awt.Graphics;

public class Square extends Shape {

    ColorShape colorShape;

    public Square(ColorShape colorShape) {
        this.colorShape = colorShape;
    }

    @Override
    public void draw(Graphics g) {
        this.colorShape.setColor(g);
        g.fillRect(5,15,50,50);
    }
}
