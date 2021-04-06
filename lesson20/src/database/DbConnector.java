package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DbConnector {
  public static Connection getConnection() throws SQLException {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("app");

    String url = resourceBundle.getString("db.url");
    String dbName = resourceBundle.getString("db.name");
    String user = resourceBundle.getString("db.user");
    String password = resourceBundle.getString("db.password");

    return DriverManager.getConnection(url + dbName, user, password);
  }
}
