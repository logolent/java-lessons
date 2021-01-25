package task2;

public class Pion extends Flower {
  public Pion(String manufacturer, int storageDays, double price) {
    super(manufacturer, storageDays, price);
    name = "Пион";
  }

  @Override
  public String getName() {
    return name;
  }
}
