package program_1.challenge;

public class Button {

  String text;

  public Button(String text) {
    this.text = text;
  }

  public void click(Command command) {
    command.execute();
  }
}