package task2;

public class Task2 {
  public static void main(String[] args) {
    // @formatter:off
    Flower[][] bouquet = {
      {
        new Rose("Argentina", 5, 140.0),
        new Tulip("Mayotte", 6, 110.0),
      },
      {
        new Pion("Malta", 12, 180.0),
        new Rose("Argentina", 5, 140.0),
        new Carnation("Moldova", 1, 100.0),
      },
      {
        new Rose("Argentina", 5, 140.0),
        new Pion("Malta", 12, 180.0),
        new Pion("Mexico", 2, 180.0),
        new Carnation("Moldova", 6, 100.0),
      },
    };
    // @formatter:on

    for (Flower[] flowers : bouquet) {
      System.out.print("Букет из: ");
      for (Flower flower : flowers) {
        System.out.print(flower.getName() + " ");
        flower.sell();
      }
      System.out.println();
    }

    System.out.println("\nПродано: " + Flower.getSoldCount());
  }
}
