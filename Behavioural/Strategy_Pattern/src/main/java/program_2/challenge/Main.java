package program_2.challenge;

public class Main {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.makePayment(Account.bankAccount, 100);
  }
}