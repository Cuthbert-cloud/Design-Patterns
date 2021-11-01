package program_2.initial_code;

public class OrderCommand implements Command {

    private Jacket jacket;

    public OrderCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void execute() {
        this.jacket.placeOrder();
    }
}
