package task5;

public class Task5 {
  public static void main(String[] args) {
    format("Крылов", 5, "Обществознание");
    format("Савельев", 5, "История");
  }

  private static void format(String secondName, int grade, String subject) {
    String string = String.format("Студент %-15s получил %-3d по %-10s", secondName, grade, subject);
    System.out.println(string);
  }
}
