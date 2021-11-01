package program_2.initial_code;

public class OrderHandler {

  public void invoke(Command command) {
      command.execute();
  }
}