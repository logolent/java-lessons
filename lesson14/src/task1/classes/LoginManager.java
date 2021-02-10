package task1.classes;

import task1.exceptions.WrongLoginException;
import task1.exceptions.WrongPasswordException;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginManager {
  private static final Predicate<String> validator = (testString) -> {
    Pattern pattern = Pattern.compile("^(\\w){1,20}$");
    Matcher matcher = pattern.matcher(testString);
    return matcher.matches();
  };

  public static boolean validateCredentials(String login, String password, String confirmPassword) {
    try {
      validateLogin(login);
      validatePassword(password, confirmPassword);
    } catch (WrongLoginException | WrongPasswordException e) {
      return false;
    }

    return true;
  }

  private static void validateLogin(String login) throws WrongLoginException {
    if (failsValidation(login)) {
      throw new WrongLoginException("Логин не соответствует требованиям");
    }
  }

  private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
    if (!password.equals(confirmPassword)) {
      throw new WrongPasswordException("Пароли не совпадают");
    }

    if (failsValidation(password)) {
      throw new WrongPasswordException("Пароль не соответствует требованиям");
    }
  }

  private static boolean failsValidation(String testString) {
    return !LoginManager.validator.test(testString);
  }
}
