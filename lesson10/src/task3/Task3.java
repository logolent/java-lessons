package task3;

public class Task3 {
  public static void main(String[] args) {
    String testString = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";

    String result = findAndReplace(testString, "object-oriented programming", "OOP", 2);

    System.out.println("From:\n" + testString + "\nTo:\n" + result);
  }

  private static String findAndReplace(
      final String originalPhrase, final String findPhrase, final String replacePhrase, int from
  ) {
    StringBuilder stringBuilder = new StringBuilder(originalPhrase);
    int startFrom = 0;
    int lastFoundIndex = -1;

    while ((lastFoundIndex = stringBuilder.toString()
                                          .toLowerCase()
                                          .indexOf(findPhrase.toLowerCase(), startFrom)) != -1) {
      if (--from <= 0) {
        stringBuilder.replace(lastFoundIndex, lastFoundIndex + findPhrase.length(), replacePhrase);
        startFrom += replacePhrase.length();
      } else {
        startFrom += findPhrase.length();
      }
    }

    return stringBuilder.toString();
  }
}
