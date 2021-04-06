package task2.entities;

import task2.StatusEnum;

public class BaseEntity<T> {
  protected final T id;
  protected StatusEnum status;

  public BaseEntity(T id, StatusEnum status) {
    this.id = id;
    this.status = status == null ? StatusEnum.ACTIVE : status;
  }

  public T getId() {
    return id;
  }
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum value) {
    status = value;
  }
}
