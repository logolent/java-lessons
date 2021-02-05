package task2;

public class User {
  private String login;
  private String password;

  public User(String login, String password) {
    this.login = login;
    this.password = password;
  }

  public void createQuery() {
    class Query {
      void printToLog() {
        System.out.println(String.format("User %s:%s sent a request", User.this.login, User.this.password));
      }
    }

    Query query = new Query();
    query.printToLog();
  }
}
