package task4;

import task4.classes.Atelier;
import task4.classes.Clothing;
import task4.classes.Pants;
import task4.classes.Skirt;
import task4.classes.Tie;
import task4.classes.Tshirt;

public class Task4 {
  public static void main(String[] args) {
    // @formatter:off
    Clothing[] clothing = {
        new Tshirt(ClothingSize.XXS, 1999, "red"),
        new Pants(ClothingSize.M, 1990, "black"),
        new Skirt(ClothingSize.S, 1450, "red"),
        new Tie(ClothingSize.L, 1100, "black")
    };
    // @formatter:on

    Atelier.dressAMen(clothing);
    System.out.println();
    Atelier.dressAWomen(clothing);
  }
}
