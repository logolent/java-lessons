package task7;

import java.util.function.Function;

public class Task7 {
  public static void main(String[] args) {
    // @formatter:off
    Function<Number, String> checkNumber = number ->
        number.doubleValue() > 0 ? "Положительное число"
                                 : number.doubleValue() < 0
                                 ? "Отрицательное число"
                                 : "Ноль";
    // @formatter:on

    System.out.println("16.0 is " + checkNumber.apply(16.0));
    System.out.println("-0 is " + checkNumber.apply(-0));
    System.out.println("-5 is " + checkNumber.apply(-5));
  }
}
