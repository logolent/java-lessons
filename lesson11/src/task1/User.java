package task1;

public class User {
  private String login;
  private String password;

  class Query {
    void printToLog() {
      System.out.println(String.format("User %s:%s sent a request", User.this.login, User.this.password));
    }
  }

  public User(String login, String password) {
    this.login = login;
    this.password = password;
  }

  public void createQuery() {
    Query query = new Query();
    query.printToLog();
  }
}
