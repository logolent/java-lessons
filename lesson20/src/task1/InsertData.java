package task1;

import database.DbConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertData {
  private static final String QUERY = "INSERT INTO phones (user_id, phone_number) VALUES (?, ?)";
  public static void main(String[] args) {
    // @formatter:off
    try (
      Connection connection = DbConnector.getConnection();
      PreparedStatement preparedStatement = connection.prepareStatement(QUERY)
    ) {
    // @formatter:on
      preparedStatement.setInt(1, 1);
      preparedStatement.setString(2, "000000");
      preparedStatement.addBatch();

      preparedStatement.setInt(1, 2);
      preparedStatement.setString(2, "000111");
      preparedStatement.addBatch();

      preparedStatement.executeBatch();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
