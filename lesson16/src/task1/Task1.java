package task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Task1 {
  public static void main(String[] args) {
    Horse horse = new Horse("Horse 1", "Breed 1");
    System.out.println("before: " + horse);
    serialize(horse, "serialized");

    Horse newHorse = deserialize("serialized");
    System.out.println("after: " + newHorse);
  }

  private static void serialize(Horse horse, String filePath) {
    // @formatter:off
    try(
      FileOutputStream fos = new FileOutputStream(filePath);
      ObjectOutputStream oos = new ObjectOutputStream(fos)
    ) {
    // @formatter:on
      oos.writeObject(horse);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  private static Horse deserialize(String filePath) {
    Horse horse = null;

    // @formatter:off
    try(
      FileInputStream fis = new FileInputStream(filePath);
      ObjectInputStream ois = new ObjectInputStream(fis)
    ) {
    // @formatter:off
      horse = (Horse) ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }

    return horse;
  }
}
