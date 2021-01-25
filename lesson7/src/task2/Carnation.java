package task2;

public class Carnation extends Flower {
  public Carnation(String manufacturer, int storageDays, double price) {
    super(manufacturer, storageDays, price);
    name = "Гвоздика";
  }

  @Override
  public String getName() {
    return name;
  }
}
