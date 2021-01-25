package task2.flowers;

public class Rose extends Flower {
  public Rose(String manufacturer, int storageDays, double price) {
    super(manufacturer, storageDays, price);
    name = "Роза";
  }

  @Override
  public String getName() {
    return name;
  }
}
