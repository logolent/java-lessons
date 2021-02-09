package task3;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Task3 {
  public static void main(String[] args) {
    String input = "1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 1, 2, 3";
    Set<String> set = Arrays.stream(input.split(",")).map(String::trim).collect(Collectors.toSet());

    String result = String.join(", ", set);
    System.out.println(result);
  }
}
