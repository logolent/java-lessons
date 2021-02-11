package task2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Task2 {
  public static void main(String[] args) {
    char[] symbols = { 'a', 'b', 'c' };

    // @formatter:off
    try (
        OutputStream output = new FileOutputStream("src/io/file.txt");
        InputStream input = new FileInputStream("src/io/file.txt");
    ) {
    // @formatter:on
      for (char symbol : symbols) {
        output.write(symbol);
      }

      int size = input.available();
      for (int i = 0; i < size; i++) {
        System.out.print((char) input.read() + " ");
      }
    } catch (IOException e) {
      System.out.print(e);
    }
  }
}
