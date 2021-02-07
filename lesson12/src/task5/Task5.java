package task5;

import java.util.function.Predicate;

public class Task5 {
  public static void main(String[] args) {
    Predicate<String> predicate = str -> (str.startsWith("J") || str.startsWith("N")) && str.endsWith("A");

    String string = "JAVA";
    System.out.println(predicate.test(string));
  }
}
