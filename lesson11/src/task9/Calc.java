package task9;

public class Calc {
  static <T extends Number> T sum(T number1, T number2) {
    Double result = number1.doubleValue() + number2.doubleValue();
    return (T) result;
  }

  static <T extends Number> T multiply(T number1, T number2) {
    Double result = number1.doubleValue() * number2.doubleValue();
    return (T) result;
  }

  static <T extends Number> T divide(T number1, T number2) {
    Double result = number1.doubleValue() / number2.doubleValue();
    return (T) result;
  }

  static <T extends Number> T subtraction(T number1, T number2) {
    Double result = number1.doubleValue() - number2.doubleValue();
    return (T) result;
  }
}
