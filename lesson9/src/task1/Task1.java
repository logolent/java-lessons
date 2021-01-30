package task1;

public class Task1 {
  public static void main(String[] args) {
    String doubleString = "33.33";

    Double doubleObject1 = Double.valueOf(11.11);
    Double doubleObject2 = Double.valueOf("22.22");
    System.out.println("Object: " + doubleObject2);

    double doublePrimitive = Double.parseDouble(doubleString);
    String testDoubleString = Double.toString(doublePrimitive);
    System.out.println("string: " + testDoubleString);

    System.out.println();

    boolean booleanValue = Boolean.parseBoolean(doubleObject1.toString());
    System.out.println("boolean: " + booleanValue);

    byte byteValue = doubleObject1.byteValue();
    System.out.println("byte: " + byteValue);

    char charValue = (char) doubleObject1.doubleValue();
    System.out.println("char: " + charValue);

    double doubleValue = doubleObject1;
    System.out.println("double: " + doubleValue);

    float floatValue = doubleObject1.floatValue();
    System.out.println("float: " + floatValue);

    int intValue = doubleObject1.intValue();
    System.out.println("int: " + intValue);

    long longValue = doubleObject1.longValue();
    System.out.println("long: " + longValue);

    short shortValue = doubleObject1.shortValue();
    System.out.println("short: " + shortValue);
  }
}
