package program_1_example;

public class Item {

  String name;
  int quantity;

  public Item(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }
}