package task5.classes;

import java.util.Scanner;

public class UserDialog {
  public static String askString(String question) {
    System.out.print(question + " ");

    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextLine()) {
      return scanner.nextLine();
    }
    return null;
  }

  public static int askInteger(String question) {
    System.out.print(question + " ");

    Scanner scanner = new Scanner(System.in);
    if (scanner.hasNextInt()) {
      return scanner.nextInt();
    }
    return -1;
  }
}
