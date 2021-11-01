package program_1.challenge;

public class PrintCommand implements Command {

  private Document document;

  public PrintCommand(Document document) {
    this.document = document;
  }

  public void execute() {
    document.print();
  }
}