package task1;

public class Phone {
  private String number;
  private String model;
  private double weight;
  private static int count = 0;

  public Phone(String number, String model, double weight) {
    this(number, model);
    this.weight = weight;
  }

  public Phone(String number, String model) {
    count++;
    this.number = number;
    this.model = model;
  }

  public Phone() {
    count++;
  }

  public void receiveCall(String caller) {
    System.out.println("Звонит " + caller);
  }

  public void receiveCall(String caller, String callerNumber) {
    System.out.println("Звонит " + caller + " (" + callerNumber + ")");
  }

  public void sendMessage(String... numbers) {
    for (String number : numbers) {
      System.out.print(number + " ");
    }
    System.out.println();
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public static int getCount() {
    return count;
  }
}
