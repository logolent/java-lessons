package task2;

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
