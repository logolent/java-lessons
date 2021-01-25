package task4;

public class Task4 {
  public static void main(String[] args) {
    Circle circle1 = new Circle(10.0);
    Circle circle2 = new Circle(15.0);

    System.out.println("Circle1 -> length: " + circle1.getLength() + " area: " + circle1.getArea());
    System.out.println("Circle2 -> length: " + circle2.getLength() + " area: " + circle2.getArea());
  }
}
