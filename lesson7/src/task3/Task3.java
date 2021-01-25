package task3;

import task3.fruits.Apple;
import task3.fruits.Apricot;
import task3.fruits.Fruit;
import task3.fruits.Pear;

public class Task3 {
  public static void main(String[] args) {
    Fruit[] apples = {
        // 120 + 180: 300
        new Apple(100), new Apple(150)
    };
    Fruit[] pears = {
        // 143 + 156: 299
        new Pear(110), new Pear(120)
    };
    Fruit[] apricots = {
        // 255 + 315: 570
        new Apricot(170), new Apricot(210)
    };

    Fruit[][] fruits = {
        apples, pears, apricots
    };

    for (Fruit[] fruitsArray : fruits) {
      for (Fruit fruit : fruitsArray) {
        fruit.sell();
      }
    }

    System.out.println("Total sold cost: " + Fruit.getTotalSoldCost());
    System.out.println("Apples sold cost: " + Apple.getSoldCost());
    System.out.println("Pears sold cost: " + Pear.getSoldCost());
    System.out.println("Apricots sold cost: " + Apricot.getSoldCost());
  }
}
