package program_1.initial_code;

public class GUI {

  private static Document document = new Document();

  public static void main(String[] args) {
    Button saveButton = new Button("Save");
    Button printButton = new Button("Print");

    saveButton.click();
    printButton.click();
  }
}