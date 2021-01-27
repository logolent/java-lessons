package task5;

import task4.ClothingSize;
import task4.classes.Clothing;
import task4.classes.Pants;
import task4.classes.Skirt;
import task4.classes.Tie;
import task4.classes.Tshirt;
import task5.classes.ClothingShop;
import task5.classes.UserDialog;

public class Task5 {
  public static void main(String[] args) {
    // @formatter:off
    Clothing[] items = {
        new Tshirt(ClothingSize.XXS, 1999, "red"),
        new Tshirt(ClothingSize.XXS, 1501, "black"),
        new Pants(ClothingSize.M, 1990, "black"),
        new Pants(ClothingSize.S, 1340, "red"),
        new Skirt(ClothingSize.S, 1450, "red"),
        new Skirt(ClothingSize.M, 1450, "black"),
        new Tie(ClothingSize.L, 1100, "black")
    };
    // @formatter:on
    ClothingShop clothingShop = new ClothingShop(items);

    waitForInput(clothingShop);
  }

  private static void waitForInput(ClothingShop shop) {
    shop.printActions();
    int index = UserDialog.askInteger("->");

    if (index < 0 || index >= ShopOperations.values().length) {
      System.exit(0);
    }

    shop.action(ShopOperations.values()[index]);
    System.out.println();
    waitForInput(shop);
  }
}
