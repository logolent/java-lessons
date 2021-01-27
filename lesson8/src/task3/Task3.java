package task3;

public class Task3 {
  public static void main(String[] args) {
    Season season = Season.SUMMER;

    Season.printFavorite(season);

    Season[] seasons = Season.values();
    for (Season s : seasons) {
      System.out.print(s + ", ");
      System.out.print("avg. temp: " + s.getAverageTemperature() + ", ");
      System.out.print("description: " + s.getDescription() + "\n");
    }
  }
}
