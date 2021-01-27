package task4.classes;

import task4.ClothingSize;
import task4.interfaces.MenClothing;

public class Tie extends Clothing implements MenClothing {
  public Tie(ClothingSize size, double price, String color) {
    super(size, price, color);
  }

  @Override
  public void dressAMen() {
    String message = String.format("Dress a man -> %s - size: %s (%d, %s), price: %.1f, color: %s",
        getClass().getSimpleName(),
        size,
        size.getEuroSize(),
        size.getDescription(),
        price,
        color);
    System.out.println(message);
  }
}
