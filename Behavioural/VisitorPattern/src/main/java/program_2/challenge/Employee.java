package program_2.challenge;

public interface Employee {
  int getSalary();
  void accept(Visitor visitor);
}