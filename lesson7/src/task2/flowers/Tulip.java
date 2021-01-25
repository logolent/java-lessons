package task2.flowers;

public class Tulip extends Flower {
  public Tulip(String manufacturer, int storageDays, double price) {
    super(manufacturer, storageDays, price);
    name = "Тюльпан";
  }

  @Override
  public String getName() {
    return name;
  }
}
