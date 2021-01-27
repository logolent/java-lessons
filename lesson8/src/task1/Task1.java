package task1;

import task1.interfaces.Printable;

public class Task1 {
  public static void main(String[] args) {
    Printable[] printables = {
        new Book("book1"), new Book("book2"), new Magazine("magazine1"), new Magazine("magazine2")
    };

    for (Printable printable : printables) {
      printable.print();
    }

    System.out.println();

    Book.printBooks(printables);
    Magazine.printMagazines(printables);
  }
}
