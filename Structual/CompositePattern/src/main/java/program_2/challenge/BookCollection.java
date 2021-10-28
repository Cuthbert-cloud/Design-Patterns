package program_2.challenge;

import java.util.ArrayList;

public class BookCollection implements Book {

  private ArrayList<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  @Override
  public void checkout() {
    books.forEach(Book::checkout);
  }

  @Override
  public void returnBook() {
    books.forEach(Book::returnBook);
  }
}
