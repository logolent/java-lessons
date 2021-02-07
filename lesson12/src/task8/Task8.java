package task8;

import java.util.Random;
import java.util.function.Supplier;

public class Task8 {
  public static void main(String[] args) {
    Supplier<Integer> randomSupplier = () -> {
      Random random = new Random();
      return random.ints(0, 11).findFirst().getAsInt();
    };

    System.out.println("Случайное число число от 0 до 10: " + randomSupplier.get());
  }
}
