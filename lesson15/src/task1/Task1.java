package task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task1 {
  public static void main(String[] args) {
    // @formatter:off
    try (
        FileInputStream fileIn = new FileInputStream("src/io/file.txt");
        FileOutputStream fileOut = new FileOutputStream("src/io/copied_file.txt")
    ) {
    // @formatter:on
      int a;
      while ((a = fileIn.read()) != -1) {
        fileOut.write(a);
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
