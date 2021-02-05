package task3;

public class Task3 {
  public static void main(String[] args) {
    User user = new User("user1", "password");
    user.createQuery();

    User.Query query = new User.Query();
    query.printToLog(new User("user2", "password"));
  }
}
