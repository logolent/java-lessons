package task2;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
  public static void main(String[] args) {
    Map<String, String> userData = new HashMap<>();
    userData.put("login1", "pass1");
    userData.put("login2", "pass2");
    userData.put("login3", "pass3");

    Store store = new Store(userData);
    store.checkUserData("login3", "pass3");
    store.checkUserData("login4", "pass4");
    store.checkUserData("login5", "пароль");
  }
}
