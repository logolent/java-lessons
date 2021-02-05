package task1;

public class Task1 {
  public static void main(String[] args) {
    User user = new User("user1", "password");
    user.createQuery();
    user.new Query().printToLog();

    System.out.println();

    new User("user2", "password").new Query().printToLog();
  }
}
