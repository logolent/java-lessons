package task2.entities;

import task2.StatusEnum;

public class User extends BaseEntity<String> {
  private final String username;
  private String password;
  private String apiKey;
  private String role;

  public User(String id, StatusEnum status, String username, String password, String apiKey, String role) {
    super(id, status);
    this.username = username;
    this.password = password;
    this.apiKey = apiKey;
    this.role = role;
  }

  public String getUsername() {
    return username;
  }
  public String getPassword() {
    return password;
  }
  public String getApiKey() {
    return apiKey;
  }
  public String getRole() {
    return role;
  }

  public void setPassword(String value) {
    password = value;
  }
  public void setApiKey(String value) {
    apiKey = value;
  }
  public void setRole(String value) {
    role = value;
  }

  @Override
  public String toString() {
    return "User{" + "id=" + id + ", status=" + status + ", username='" + username + '\'' + ", password='" + password + '\'' + ", apiKey='" + apiKey + '\'' + ", role='" + role + '\'' + '}';
  }
}
