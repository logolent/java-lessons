package task1;

import database.DbConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetrieveData {
  private static final String QUERY = "SELECT * FROM phones WHERE phone_number like ?";

  public static void main(String[] args) {
    // @formatter:off
    try (
      Connection connection = DbConnector.getConnection();
      PreparedStatement preparedStatement = connection.prepareStatement(QUERY)
    ) {
    // @formatter:on
      preparedStatement.setString(1, "0%");
      ResultSet set = preparedStatement.executeQuery();

      while (set.next()) {
        int id = set.getInt(1);
        int userId = set.getInt(2);
        String phoneNumber = set.getString(3);

        System.out.printf("[%d] id: %d user_id: %d phone_number: %s\n", set.getRow(), id, userId, phoneNumber);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
