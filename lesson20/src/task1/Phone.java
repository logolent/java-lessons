package task1;

public class Phone {
  private final int id;
  private final int userId;
  private final String phoneNumber;

  public Phone(int id, int userId, String phoneNumber) {
    this.id = id;
    this.userId = userId;
    this.phoneNumber = phoneNumber;
  }

  public int getUserId() {
    return userId;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Phone{" + "id=" + id + ", userId=" + userId + ", phoneNumber='" + phoneNumber + '\'' + '}';
  }
}
