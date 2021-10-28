package program_1.challenge;
import java.awt.Color;
import java.awt.Graphics;

public class ComponentWithRedBorder implements Component {

  private final Component decoratedComponent;

  public ComponentWithRedBorder(Component component) {
    this.decoratedComponent = component;
  }

  public void draw(Graphics graphics) {
    graphics.setColor(Color.RED);
    decoratedComponent.draw(graphics);
    graphics.setColor(Color.BLACK);
  }
}