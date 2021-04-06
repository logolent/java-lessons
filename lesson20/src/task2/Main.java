package task2;

import database.DbConnector;
import task2.dao.KeyDao;
import task2.dao.UserDao;
import task2.entities.Key;
import task2.entities.User;

import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDate;

public class Main {
  // @formatter:off
  private static final String CREATE_USERS_TABLE =
      "CREATE TABLE IF NOT EXISTS users (" +
          "id VARCHAR(128) NOT NULL," +
          "status ENUM('ACTIVE', 'DELETED') DEFAULT 'ACTIVE'," +
          "username VARCHAR(32) NOT NULL," +
          "password VARCHAR(128) NOT NULL," +
          "api_key VARCHAR(64) DEFAULT NULL," +
          "role VARCHAR(32) DEFAULT NULL," +
          "PRIMARY KEY (id))";
  private static final String CREATE_FILES_TABLE =
      "CREATE TABLE IF NOT EXISTS files (" +
          "id INT NOT NULL AUTO_INCREMENT," +
          "status ENUM('ACTIVE', 'DELETED') DEFAULT 'ACTIVE'," +
          "file_name VARCHAR(128) NOT NULL," +
          "original_name VARCHAR(256) NOT NULL," +
          "mime VARCHAR(32) NOT NULL," +
          "user_id VARCHAR(128) NOT NULL," +
          "PRIMARY KEY (id)," +
          "FOREIGN KEY files_user_fk (user_id) REFERENCES users (id))";
  private static final String CREATE_KEYS_TABLE =
      "CREATE TABLE IF NOT EXISTS `keys` (" +
          "id INT NOT NULL AUTO_INCREMENT," +
          "status ENUM('ACTIVE', 'DELETED') DEFAULT 'ACTIVE'," +
          "created_at DATE DEFAULT CURRENT_DATE," +
          "expiring_at DATE DEFAULT NULL," +
          "access_key VARCHAR(64) NOT NULL," +
          "user_id VARCHAR(128) DEFAULT NULL," +
          "PRIMARY KEY (id)," +
          "FOREIGN KEY keys_user_fk (user_id) REFERENCES users (id))";
  // @formatter:on

  public static void main(String[] args) {
    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        Statement statement = connection.createStatement()
    ) {
    // @formatter:on
      statement.addBatch("DROP TABLE if exists files");
      statement.addBatch("DROP TABLE if exists `keys`");
      statement.addBatch("DROP TABLE if exists users");
      statement.addBatch(CREATE_USERS_TABLE);
      statement.addBatch(CREATE_FILES_TABLE);
      statement.addBatch(CREATE_KEYS_TABLE);
      statement.executeBatch();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    UserDao userDao = new UserDao();
    User testUser = new User("123", null, "user1", "password", null, null);
    userDao.create(testUser);
    System.out.println(userDao.findAll());

    KeyDao keyDao = new KeyDao();
    LocalDate currentDate = LocalDate.now();
    Key key = new Key(null, null, currentDate, currentDate.plusDays(10), "123", "key");
    keyDao.create(key);
    System.out.println(keyDao.findAll());
  }
}
