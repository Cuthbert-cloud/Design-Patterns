package program_2.challenge;
import java.util.ArrayList;

public class PizzaPepperoni implements Pizza {

  ArrayList toppings = new ArrayList<String>();
  static String name = "Pepperoni";

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
