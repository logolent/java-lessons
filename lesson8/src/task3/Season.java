package task3;

public enum Season {
  WINTER(-14.0), SPRING(10.0), SUMMER(19.0) {
    @Override
    public String getDescription() {
      return "Теплое время года";
    }
  }, AUTUMN(5.0);

  private final double averageTemperature;

  Season(double averageTemperature) {
    this.averageTemperature = averageTemperature;
  }

  public static void printFavorite(Season season) {
    switch (season) {
      case WINTER: {
        System.out.println("Я люблю зиму");
        break;
      }
      case SPRING: {
        System.out.println("Я люблю весну");
        break;
      }
      case SUMMER: {
        System.out.println("Я люблю лето");
        break;
      }
      case AUTUMN: {
        System.out.println("Я люблю осень");
        break;
      }
    }
  }

  public String getDescription() {
    return "Холодное время года";
  }

  public double getAverageTemperature() {
    return averageTemperature;
  }
}
