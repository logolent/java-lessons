package task1;

public class Task1 {
  public static void main(String[] args) {
    Phone phone1 = new Phone("11111111", "model1", 50);
    Phone phone2 = new Phone("22222222", "model2");
    Phone phone3 = new Phone();

    System.out.println("Phones created: " + Phone.getCount());
  }
}
