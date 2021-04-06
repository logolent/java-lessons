package task1;

import database.DbConnector;

import java.sql.Connection;
import java.sql.Statement;

public class CreatingTable {
  // @formatter:off
  private static final String CREATE_TABLE_QUERY =
      "CREATE TABLE phones (" +
          "id INT NOT NULL AUTO_INCREMENT," +
          "user_id INT NOT NULL," +
          "phone_number VARCHAR(10)," +
          "PRIMARY KEY (id))";
  // @formatter:on

  public static void main(String[] args) {
    // @formatter:off
    try (
      Connection connection = DbConnector.getConnection();
      Statement statement = connection.createStatement()
    ) {
    // @formatter:on
      statement.executeUpdate(CREATE_TABLE_QUERY);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
