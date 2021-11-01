package program_1_example;

public interface Groceries {
  double getPrice();
  void accept(Visitor visitor);
}