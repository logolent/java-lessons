package task9;

public class Task9 {
  public static void main(String[] args) {
    Integer i = 10;
    Byte b = 5;
    Float f = 10.5f;
    Double d = 5.5;

    System.out.println("10 + 5 = " + Calc.sum(i, b));
    System.out.println("10 * 10.5 = " + Calc.multiply(i, f));
    System.out.println("10.5f / 5.5 = " + Calc.divide(f, d));
    System.out.println("5.5 - 5 = " + Calc.subtraction(d, b));
  }
}
