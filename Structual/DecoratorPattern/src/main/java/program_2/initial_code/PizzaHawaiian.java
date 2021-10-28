package program_2.initial_code;
import java.util.ArrayList;

public class PizzaHawaiian implements Pizza {

  private static final ArrayList toppings = new ArrayList<String>();
  private static final String name = "Hawaiian";

  public PizzaHawaiian() {
    toppings.add("cheese");
    toppings.add("tomato");
    toppings.add("ham");
    toppings.add("pineapple");
  }

  public ArrayList getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }
}
