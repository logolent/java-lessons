package task9;

@FunctionalInterface
interface Printable<T> {
  void print(T value);
}

public class Task9 {
  public static void main(String[] args) {
    Printable<String> printable = System.out::println;
    printable.print("Message");
  }
}
