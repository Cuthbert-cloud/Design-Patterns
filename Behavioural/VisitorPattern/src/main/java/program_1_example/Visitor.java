package program_1_example;

public interface Visitor {
  void visit(Bread bread);
  void visit(Milk milk);
  void visit(GroceryList groceryList);
}