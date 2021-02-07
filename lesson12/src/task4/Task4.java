package task4;

import java.util.function.Predicate;

public class Task4 {
  public static void main(String[] args) {
    Predicate<String> stringIsNotNull = str -> str != null;
    Predicate<String> stringIsNotEmpty = str -> str.trim().length() > 0;

    String nullString = null;

    testString("string", stringIsNotNull, stringIsNotEmpty);
    testString("  ", stringIsNotNull, stringIsNotEmpty);
    testString(nullString, stringIsNotNull, stringIsNotEmpty);
  }

  private static void testString(String string, Predicate<String> notNull, Predicate<String> notEmpty) {
    if (notNull.and(notEmpty).test(string)) {
      System.out.println("String [" + string + "] Not null AND Not empty");
    } else {
      System.out.println("String [" + string + "] null OR empty");
    }
  }
}
