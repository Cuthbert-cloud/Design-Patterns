package program_2.initial_code;
import java.util.ArrayList;

public class PizzaPepperoni implements Pizza {

  private final static ArrayList toppings = new ArrayList<String>();
  private final static String name = "Pepperoni";

  public PizzaPepperoni() {
    toppings.add("cheese");
    toppings.add("tomato");
    toppings.add("pepperoni");
  }

  public ArrayList getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }
}
