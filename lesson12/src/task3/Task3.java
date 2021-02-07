package task3;

import java.util.function.Predicate;

public class Task3 {
  public static void main(String[] args) {
    Predicate<String> stringIsEmpty = str -> str.trim().length() == 0;

    System.out.println(stringIsEmpty.test(""));
    System.out.println(stringIsEmpty.test("   "));
    System.out.println(stringIsEmpty.test("string"));
  }
}
