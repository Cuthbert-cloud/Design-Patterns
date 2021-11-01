package program_2.initial_code;

public class ReturnOrderCommand implements Command {

    private Jacket jacket;

    public ReturnOrderCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void execute() {
        this.jacket.returnOrder();
    }
}
