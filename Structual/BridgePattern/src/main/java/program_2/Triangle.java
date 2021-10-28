package program_2;

import java.awt.Graphics;

public class Triangle extends Shape{

    ColorShape colorShape;

    public Triangle(ColorShape colorShape) {
        this.colorShape = colorShape;
    }

    @Override
    public void draw(Graphics g) {
        this.colorShape.setColor(g);
        int[] x = {200,250,150};
        int[] y = {15,65,65};
        int n = 3;
        g.fillPolygon(x,y,n);
    }
}
