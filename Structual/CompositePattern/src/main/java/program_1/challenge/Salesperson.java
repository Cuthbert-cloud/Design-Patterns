package program_1.challenge;

public class Salesperson implements Payee {

  private final String name;

  private final Manager manager;

  public Salesperson(String name, Manager manager) {
    this.name = name;
    this.manager = manager;
  }

  @Override
  public void payExpenses(int amount) {
    System.out.println(name + " has been paid $" + amount);
  }
}
