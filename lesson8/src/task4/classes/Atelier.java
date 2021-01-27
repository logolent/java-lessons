package task4.classes;

import task4.interfaces.MenClothing;
import task4.interfaces.WomenClothing;

public class Atelier {
  public static void dressAMen(Clothing[] clothing) {
    for (Clothing c : clothing) {
      if (c instanceof MenClothing) {
        ((MenClothing) c).dressAMen();
      }
    }
  }

  public static void dressAWomen(Clothing[] clothing) {
    for (Clothing c : clothing) {
      if (c instanceof WomenClothing) {
        ((WomenClothing) c).dressAWoman();
      }
    }
  }
}
