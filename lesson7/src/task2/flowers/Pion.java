package task2.flowers;

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
