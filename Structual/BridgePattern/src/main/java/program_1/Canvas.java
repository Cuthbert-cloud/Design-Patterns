package program_1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Canvas extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.add(new Canvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Square square = new BlueSquare();
        square.draw(g);
        Circle circle = new RedCircle();
        circle.draw(g);
        Triangle triangle = new GreenTriangle();
        triangle.draw(g);
    }
}
