package task3;

public class Task3 {
  public static void main(String[] args) {
    if (Files.copy("./src/task3/file1.txt", "./src/task3/dest.txt")) {
      System.out.println("файл скопирован");
    }
  }
}
