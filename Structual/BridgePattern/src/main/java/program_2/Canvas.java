package program_2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Canvas extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.add(new program_1.Canvas());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        Square square = new Square(new BlueColorShape());
        square.draw(g);
        Circle circle = new Circle(new RedColorShape());
        circle.draw(g);
        Triangle triangle = new Triangle(new GreenColorShape());
        triangle.draw(g);
    }
}
