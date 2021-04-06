package task2.dao;

import database.AbstractDao;
import database.DbConnector;
import task2.StatusEnum;
import task2.entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao extends AbstractDao<User, String> {
  private static final String SELECT_ALL = "SELECT * FROM users";
  private static final String SELECT_BY_ID = "SELECT * FROM users WHERE id = ?";
  private static final String DELETE_BY_ID = "DELETE FROM users WHERE id = ?";
  private static final String INSERT = "INSERT INTO users (id, username, password) VALUES (?, ?, ?)";
  private static final String UPDATE = "UPDATE users SET status = ?, password = ?, api_key = ?, role = ? WHERE id = ?";

  @Override
  public List<User> findAll() {
    List<User> users = new ArrayList<>();

    // @formatter:off
    try (
      Connection connection = DbConnector.getConnection();
      Statement statement = connection.createStatement()
    ) {
    // @formatter:on
      ResultSet rs = statement.executeQuery(SELECT_ALL);

      while (rs.next()) {
        String id = rs.getString(1);
        StatusEnum status = StatusEnum.valueOf(rs.getString(2));
        String username = rs.getString(3);
        String password = rs.getString(4);
        String apiKey = rs.getString(5);
        String role = rs.getString(6);
        users.add(new User(id, status, username, password, apiKey, role));
      }
    } catch (SQLException e) {
      System.out.println("[UserDao: FindAll] - " + e.getMessage());
    }

    return users;
  }

  @Override
  public User findById(String id) {
    User user = null;

    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID)
    ) {
    // @formatter:on
      preparedStatement.setString(1, id);
      ResultSet rs = preparedStatement.executeQuery(SELECT_ALL);

      if (rs.next()) {
        StatusEnum status = StatusEnum.valueOf(rs.getString(2));
        String username = rs.getString(3);
        String password = rs.getString(4);
        String apiKey = rs.getString(5);
        String role = rs.getString(6);
        user = new User(id, status, username, password, apiKey, role);
      }
    } catch (SQLException e) {
      System.out.println("[UserDao: FindById] - " + e.getMessage());
    }

    return user;
  }

  @Override
  public boolean deleteById(String id) {
    return deleteWithId(id);
  }

  @Override
  public boolean delete(User entity) {
    return deleteWithId(entity.getId());
  }

  @Override
  public boolean create(User entity) {
    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT)
    ) {
    // @formatter:on
      preparedStatement.setString(1, entity.getId());
      preparedStatement.setString(2, entity.getUsername());
      preparedStatement.setString(3, entity.getPassword());
      return preparedStatement.execute();
    } catch (SQLException e) {
      System.out.println("[UserDao: Create] - " + e.getMessage());
      return false;
    }
  }

  @Override
  public User update(User entity) {
    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)
    ) {
    // @formatter:on
      preparedStatement.setString(1, entity.getStatus().toString());
      preparedStatement.setString(2, entity.getPassword());
      preparedStatement.setString(3, entity.getApiKey());
      preparedStatement.setString(4, entity.getRole());
      preparedStatement.setString(5, entity.getId());
      preparedStatement.execute();
    } catch (SQLException e) {
      System.out.println("[UserDao: Update] - " + e.getMessage());
    }

    return entity;
  }

  private boolean deleteWithId(String id) {
    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID)
    ) {
    // @formatter:on
      preparedStatement.setString(1, id);
      return preparedStatement.execute();
    } catch (SQLException e) {
      System.out.println("[UserDao: Delete] - " + e.getMessage());
      return false;
    }
  }
}
