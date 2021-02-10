package task1;

import task1.classes.LoginManager;

public class Task1 {
  public static void main(String[] args) {
    System.out.println(LoginManager.validateCredentials("Login1", "_Pass1", "_Pass1"));
    System.out.println(LoginManager.validateCredentials("login2", "pass2", "pass1"));
    System.out.println(LoginManager.validateCredentials("01234567890123456789a", "pass3", "pass3"));
    System.out.println(LoginManager.validateCredentials("login4", "pass4н", "pass4н"));
  }
}
