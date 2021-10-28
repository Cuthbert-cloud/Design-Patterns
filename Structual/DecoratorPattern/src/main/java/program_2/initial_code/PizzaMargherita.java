package program_2.initial_code;
import java.util.ArrayList;

public class PizzaMargherita implements Pizza {

  private final static ArrayList toppings = new ArrayList<String>();
  private final static String name = "Margherita";

  public PizzaMargherita() {
    toppings.add("cheese");
    toppings.add("tomato");
  }

  public ArrayList getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }
}
