package task1;

public class Task1 {
  public static void main(String[] args) {
    testString("I like Java!!!");
  }

  private static void testString(String string) {
    System.out.println("Last symbol: " + string.charAt(string.length() - 1));

    if (string.endsWith("!!!")) {
      System.out.println("Ends with \"!!!\"");
    }

    if (string.startsWith("I like")) {
      System.out.println("Starts with \"I like\"");
    }

    if (string.contains("Java")) {
      System.out.println("Contains \"Java\"");
    }

    final int javaPosition = string.indexOf("Java");
    System.out.println("\"Java\" position: " + javaPosition);

    System.out.println("After replace: " + string.replace("a", "o"));

    System.out.println("Uppercase: " + string.toUpperCase());
    System.out.println("Lowercase: " + string.toLowerCase());

    if (javaPosition != -1) {
      String java = string.substring(javaPosition, javaPosition + "Java".length());
      System.out.println(string + " : " + java + " at " + javaPosition);
    }
  }
}
