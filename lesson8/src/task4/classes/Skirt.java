package task4.classes;

import task4.ClothingSize;
import task4.interfaces.WomenClothing;

public class Skirt extends Clothing implements WomenClothing {
  public Skirt(ClothingSize size, double price, String color) {
    super(size, price, color);
  }

  @Override
  public void dressAWoman() {
    String message = String.format("Dress a woman -> %s - size: %s (%d, %s), price: %.1f, color: %s",
        getClass().getSimpleName(),
        size,
        size.getEuroSize(),
        size.getDescription(),
        price,
        color);
    System.out.println(message);
  }
}
