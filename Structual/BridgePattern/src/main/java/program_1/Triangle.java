package program_1;

import java.awt.Graphics;

public abstract class Triangle extends Shape {
    public void draw(Graphics g) {
        int[] x = {200,250,150};
        int[] y = {15,65,65};
        int n = 3;
        g.fillPolygon(x,y,n);
    }
}
