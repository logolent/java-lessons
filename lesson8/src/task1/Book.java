package task1;

import task1.interfaces.Printable;

public class Book implements Printable {
  private String name;

  public Book(String name) {
    this.name = name;
  }

  public static void printBooks(Printable[] printables) {
    System.out.print("Only books: ");
    for (Printable printable : printables) {
      if (printable instanceof Book) {
        System.out.print(((Book) printable).getName() + " ");
      }
    }
    System.out.println();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void print() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "Book{" + "name='" + name + '\'' + '}';
  }
}
