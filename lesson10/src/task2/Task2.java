package task2;

public class Task2 {
  public static void main(String[] args) {
    String[] strings = getStrings(3, 56);
    replaceChar(strings, '=', "равно");
    replaceString(strings, "=", "равно");
  }

  private static String[] getStrings(int a, int b) {
    String[] strings = new String[3];
    strings[0] = new StringBuilder().append(a).append(" + ").append(b).append(" = ").append(a + b).toString();
    strings[1] = new StringBuilder().append(a).append(" - ").append(b).append(" = ").append(a - b).toString();
    strings[2] = new StringBuilder().append(a).append(" * ").append(b).append(" = ").append(a * b).toString();

    return strings;
  }

  private static void replaceChar(String[] strings, final char character, final String to) {
    for (String string : strings) {
      int index = string.indexOf(character);
      if (index != -1) {
        string = new StringBuilder(string).deleteCharAt(index).insert(index, to).toString();
        System.out.println(string);
      }
    }
  }

  private static void replaceString(String[] strings, final String from, final String to) {
    for (String string : strings) {
      int index = string.indexOf(from);
      if (index != -1) {
        string = new StringBuilder(string).replace(index, index + from.length(), to).toString();
        System.out.println(string);
      }
    }
  }
}
