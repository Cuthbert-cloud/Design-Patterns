package program_2.challenge;

public interface Account {
    void makePayment(int amount);
    Account bankAccount = (int amount) -> System.out.println("Payment of £ " + amount + " made from bank account.");
    Account payPalAccount = (int amount) -> System.out.println("Payment of £ " + amount + " made from payPal account.");
}
