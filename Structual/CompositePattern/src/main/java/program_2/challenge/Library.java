package program_2.challenge;

public class Library {

  public static void main(String[] args) {
    NonfictionBook nonfictionBook = new NonfictionBook("A Brief History of Time");
    FictionBook fictionBookOne = new FictionBook("Hamlet", true);
    FictionBook fictionBookTwo = new FictionBook("The Great Gatsby", false);

    BookCollection bookCollection = new BookCollection();
    bookCollection.addBook(nonfictionBook);
    bookCollection.addBook(fictionBookOne);
    bookCollection.addBook(fictionBookTwo);

    checkoutBook(nonfictionBook);
    checkoutBook(fictionBookOne);
    checkoutBook(bookCollection);

    returnBook(nonfictionBook);
    returnBook(fictionBookOne);
    returnBook(bookCollection);
  }

  public static void checkoutBook(Book book) {
    System.out.println("Checking out from library...");
    book.checkout();
  }

  public static void returnBook(Book book) {
    System.out.println("Returning to library...");
    book.returnBook();
  }
}
