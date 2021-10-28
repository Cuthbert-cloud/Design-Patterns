package program_1.challenge;

public class Manager implements Payee {

  private final String name;

  public Manager(String name) {
    this.name = name;
  }

  @Override
  public void payExpenses(int amount) {
    System.out.println(name + " has been paid $" + amount);
  }
}
