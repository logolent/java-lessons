package task3.fruits;

public class Apple extends Fruit {
  private static double pricePerWeight;
  private static double soldCost;

  public Apple(double weight) {
    super(weight);
    pricePerWeight = 1.2;
  }

  @Override
  public void sell() {
    double price = getPrice();
    totalSoldCost += price;
    soldCost += price;
  }

  @Override
  public double getPrice() {
    return weight * pricePerWeight;
  }

  public static double getSoldCost() {
    return soldCost;
  }
}
