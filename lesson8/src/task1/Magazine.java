package task1;

import task1.interfaces.Printable;

public class Magazine implements Printable {
  private String name;

  public Magazine(String name) {
    this.name = name;
  }

  public static void printMagazines(Printable[] printables) {
    System.out.print("Only magazines: ");
    for (Printable printable : printables) {
      if (printable instanceof Magazine) {
        System.out.print(((Magazine) printable).getName() + " ");
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
  public String toString() {
    return "Magazine{" + "name='" + name + '\'' + '}';
  }

  @Override
  public void print() {
    System.out.println(toString());
  }
}
