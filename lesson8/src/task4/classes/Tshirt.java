package task4.classes;

import task4.ClothingSize;
import task4.interfaces.MenClothing;
import task4.interfaces.WomenClothing;

public class Tshirt extends Clothing implements MenClothing, WomenClothing {
  public Tshirt(ClothingSize size, double price, String color) {
    super(size, price, color);
  }

  @Override
  public void dressAMen() {
    System.out.println(formatDressA("man"));
  }

  @Override
  public void dressAWoman() {
    System.out.println(formatDressA("woman"));
  }

  private String formatDressA(String gender) {
    final String message = String.format("Dress a %s -> %s - size: %s (%d, %s), price: %.1f, color: %s",
        gender,
        getClass().getSimpleName(),
        size,
        size.getEuroSize(),
        size.getDescription(),
        price,
        color);
    return message;
  }
}
