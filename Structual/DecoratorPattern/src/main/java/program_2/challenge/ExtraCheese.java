package program_2.challenge;
import java.util.ArrayList;

public class ExtraCheese implements Pizza {

    private final Pizza pizza;
    private ArrayList toppings;

    public ExtraCheese(Pizza pizza) {
        this.pizza = pizza;
        this.toppings = this.pizza.getToppings();
        toppings.add("extra cheese");
    }

    @Override
    public ArrayList getToppings() {
        return this.toppings;
    }

    @Override
    public String getName() {
        return this.pizza.getName();
    }
}
