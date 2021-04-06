package task2.entities;

import task2.StatusEnum;

public class File extends BaseEntity<Integer> {
  private final String fileName;
  private final String originalName;
  private final String mime;
  private final String userId;

  public File(Integer id, StatusEnum status, String fileName, String originalName, String mime, String userId) {
    super(id, status);
    this.fileName = fileName;
    this.originalName = originalName;
    this.mime = mime;
    this.userId = userId;
  }

  public String getFileName() {
    return fileName;
  }
  public String getOriginalName() {
    return originalName;
  }
  public String getMime() {
    return mime;
  }
  public String getUserId() {
    return userId;
  }

  @Override
  public String toString() {
    return "File{" + "id=" + id + ", status=" + status + ", fileName='" + fileName + '\'' + ", originalName='" + originalName + '\'' + ", mime='" + mime + '\'' + ", userId='" + userId + '\'' + '}';
  }
}
