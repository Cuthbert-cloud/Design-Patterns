package program_1_example;

public class Client {

  public static void main(String[] args) {
    DocumentHandler chain = new SlideshowHandler(new SpreadsheetHandler(new TextDocumentHandler(null)));
    chain.openDocument("xlsx");
    chain.openDocument("txt");
  }
}
