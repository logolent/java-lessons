package task2;

import java.util.function.Predicate;

public class Task2 {
  public static void main(String[] args) {
    Predicate<String> stringIsNull = str -> str == null;

    String string = "string";
    String nullString = null;

    System.out.println(stringIsNull.test(string));
    System.out.println(stringIsNull.test(nullString));
  }
}
