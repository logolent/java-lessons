package task4;

public class Circle {
  public static final double PI = Math.PI;
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getLength() {
    return PI * radius * 2;
  }

  public double getArea() {
    return PI * radius * radius;
  }
}
