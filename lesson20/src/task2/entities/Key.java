package task2.entities;

import task2.StatusEnum;

import java.time.LocalDate;

public class Key extends BaseEntity<Integer> {
  private final LocalDate createdAt;
  private final LocalDate expiringAt;
  private final String userId;
  private final String accessKey;

  public Key(
      Integer id, StatusEnum status, LocalDate createdAt, LocalDate expiringAt, String userId, String accessKey
  ) {
    super(id, status);
    this.createdAt = createdAt;
    this.expiringAt = expiringAt;
    this.userId = userId;
    this.accessKey = accessKey;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }
  public LocalDate getExpiringAt() {
    return expiringAt;
  }
  public String getUserId() {
    return userId;
  }
  public String getAccessKey() {
    return accessKey;
  }

  @Override
  public String toString() {
    return "Key{" + "id=" + id + ", status=" + status + ", createdAt=" + createdAt + ", expiringAt=" + expiringAt + ", userId='" + userId + '\'' + ", accessKey='" + accessKey + '\'' + '}';
  }
}
