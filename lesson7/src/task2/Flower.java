package task2;

public abstract class Flower {
  private String manufacturer;
  private int storageDays;
  private double price;
  protected String name;
  private static int soldCount;

  public Flower(String manufacturer, int storageDays, double price) {
    this.manufacturer = manufacturer;
    this.storageDays = storageDays;
    this.price = price;
  }

  public Flower() {
  }

  public void sell() {
    soldCount++;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public int getStorageDays() {
    return storageDays;
  }

  public void setStorageDays(int storageDays) {
    this.storageDays = storageDays;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public static int getSoldCount() {
    return soldCount;
  }

  public abstract String getName();
}
