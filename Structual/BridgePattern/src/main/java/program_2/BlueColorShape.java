package program_2;

import java.awt.Graphics;
import java.awt.Color;
public class BlueColorShape implements ColorShape {
    @Override
    public void setColor(Graphics g) {
        g.setColor(Color.BLUE);
    }
}
