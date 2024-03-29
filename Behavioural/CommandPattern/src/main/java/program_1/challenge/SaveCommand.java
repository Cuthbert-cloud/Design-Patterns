package program_1.challenge;

public class SaveCommand implements Command {

  private Document document;

  public SaveCommand(Document document) {
    this.document = document;
  }

  public void execute() {
    document.save();
  }
}