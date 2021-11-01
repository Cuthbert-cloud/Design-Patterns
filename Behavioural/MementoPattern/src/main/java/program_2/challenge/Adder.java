package program_2.challenge;

public class Adder {

  private int result;
  private memento memento = new memento(result);

  public void add(int newNumber) {
    this.result += newNumber;
  }

  public void save() {
    this.memento.setState(result);
  }

  public void undo() {
    this.result = this.memento.getState();
  }

  public int getResult() {
    return result;
  }
}