package task4;

public class Task4 {
  public static void main(String[] args) {
    System.out.println("string -> " + getMiddleChars("string"));
    System.out.println("code -> " + getMiddleChars("code"));
    System.out.println("Practice -> " + getMiddleChars("Practice"));
  }

  private static String getMiddleChars(String string) {
    if (string.length() % 2 != 0 || string.length() == 0) {
      return null;
    }

    return string.substring(string.length() / 2 - 1, string.length() / 2 + 1);
  }
}
