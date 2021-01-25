package task3.fruits;

public abstract class Fruit {
  protected double weight;
  protected static double totalSoldCost;

  public Fruit(double weight) {
    this.weight = weight;
  }

  public final void printManufacturerInfo() {
    System.out.print("Made in Ukraine");
  }

  public abstract void sell();

  public abstract double getPrice();

  public double getWeight() {
    return weight;
  }

  public static double getTotalSoldCost() {
    return totalSoldCost;
  }
}
