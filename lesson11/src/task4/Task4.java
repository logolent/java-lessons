package task4;

public class Task4 {
  public static void main(String[] args) {
    Printable printable = new Printable() {
      @Override
      public void print() {
        System.out.println("print from anonymous class");
      }
    };

    printable.print();
  }
}
