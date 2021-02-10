package task2;

import task1.classes.LoginManager;

import java.util.Map;

public class Store {
  private Map<String, String> userData;

  Store(Map<String, String> userData) {
    this.userData = userData;
  }

  public boolean checkUserData(String login, String password) {
    String pass;

    // @formatter:off
    if ((pass = userData.get(login)) != null && password.equals(pass)) {
      System.out.println("Пользователь [" + login + "] аутентифицирован");
      return true;
    } else if (LoginManager.validateCredentials(login, password, password)) {
      System.out.println("Пользователь [" + login + "] добавлен");
      this.userData.put(login, password);
      return true;
    }
    // @formatter:on

    System.out.println("Введенные данные не соответстуют требованиям");
    return false;
  }
}
