package program_1.challenge;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {

  private final List<Payee> payees = new ArrayList<>();

  void addPayee(Payee payee) {
    payees.add(payee);
  }

  @Override
  public void payExpenses(int amount) {
    payees.forEach(manager -> manager.payExpenses(amount));
  }
}
