package task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
  public static boolean copy(String src, String dest) {
    // @formatter:off
    try(
      BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dest))
    ) {
    // @formatter:on
      int buffer;
      while ((buffer = bufferedReader.read()) != -1) {
        bufferedWriter.write(buffer);
      }
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }

    return true;
  }
}
