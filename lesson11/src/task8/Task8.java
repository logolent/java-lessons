package task8;

public class Task8 {
  public static void main(String[] args) {
    Double[] doubleArray = {
        150.0, 1.0101, 61.6, 123.1651, 5818.19, 0.2
    };
    testMinMax(doubleArray);

    Character[] charArray = {
        '1', '3', 'a', 'c', 'z', '3', 'u', '6'
    };
    testMinMax(charArray);

    String[] stringArray = {
        "string1", "string2", "string810", "string4", "string5", "string6"
    };
    testMinMax(stringArray);
  }

  private static <T extends Comparable<T>> void testMinMax(T[] array) {
    MinMax<T> minMax = new MinMax<T>(array);
    System.out.println("min: " + minMax.getMinElement() + " max: " + minMax.getMaxElement());
  }
}
