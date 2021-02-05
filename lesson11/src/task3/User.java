package task3;

public class User {
  private String login;
  private String password;

  static class Query {
    void printToLog(User user) {
      System.out.println(String.format("User %s:%s sent a request", user.login, user.password));
    }
  }

  public User(String login, String password) {
    this.login = login;
    this.password = password;
  }

  public void createQuery() {
    Query query = new Query();
    query.printToLog(this);
  }
}
