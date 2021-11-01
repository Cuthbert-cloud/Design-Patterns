package program_2.initial_code;

public class SalesOrderClient {

  private static Jacket jacket = new Jacket();

  public static void main(String[] args) {
    OrderHandler placeOrderHandler = new OrderHandler();
    OrderHandler returnOrderHandler = new OrderHandler();

    placeOrderHandler.invoke(new OrderCommand(jacket));
    returnOrderHandler.invoke(new ReturnOrderCommand(jacket));
  }
}