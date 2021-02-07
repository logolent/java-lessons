package task1;

@FunctionalInterface
interface Printable<T> {
  void print(T value);
}

public class Task1 {
  public static void main(String[] args) {
    Printable<String> printable = str -> System.out.println(str);
    printable.print("Message");
  }
}
