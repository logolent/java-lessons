package task4.classes;

import task4.ClothingSize;

public abstract class Clothing {
  protected ClothingSize size;
  protected double price;
  protected String color;

  public Clothing(ClothingSize size, double price, String color) {
    this.size = size;
    this.price = price;
    this.color = color;
  }

  public ClothingSize getSize() {
    return size;
  }

  public double getPrice() {
    return price;
  }

  public String getColor() {
    return color;
  }
}
