package task2.dao;

import database.AbstractDao;
import database.DbConnector;
import task2.StatusEnum;
import task2.entities.Key;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class KeyDao extends AbstractDao<Key, Integer> {
  private static final String SELECT_ALL = "SELECT * FROM `keys`";
  private static final String SELECT_BY_ID = "SELECT * FROM `keys` WHERE id = ?";
  private static final String DELETE_BY_ID = "DELETE FROM `keys` WHERE id = ?";
  private static final String INSERT = "INSERT INTO `keys` (created_at, expiring_at, user_id, access_key) VALUES (?, ?, ?, ?)";
  private static final String UPDATE = "UPDATE files SET status = ? WHERE id = ?";

  @Override
  public List<Key> findAll() {
    List<Key> keys = new ArrayList<>();

    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        Statement statement = connection.createStatement()
    ) {
    // @formatter:on
      ResultSet rs = statement.executeQuery(SELECT_ALL);

      while (rs.next()) {
        Integer id = rs.getInt(1);
        StatusEnum status = StatusEnum.valueOf(rs.getString(2));
        LocalDate createdAt = rs.getDate(3).toLocalDate();
        LocalDate expiringAt = rs.getDate(4).toLocalDate();
        String accessKey = rs.getString(5);
        String userId = rs.getString(6);
        keys.add(new Key(id, status, createdAt, expiringAt, userId, accessKey));
      }
    } catch (SQLException e) {
      System.out.println("[KeyDao: FindAll] - " + e.getMessage());
    }

    return keys;
  }

  @Override
  public Key findById(Integer id) {
    Key key = null;

    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID)
    ) {
    // @formatter:on
      preparedStatement.setInt(1, id);
      ResultSet rs = preparedStatement.executeQuery(SELECT_ALL);

      if (rs.next()) {
        StatusEnum status = StatusEnum.valueOf(rs.getString(2));
        LocalDate createdAt = rs.getDate(3).toLocalDate();
        LocalDate expiringAt = rs.getDate(4).toLocalDate();
        String userId = rs.getString(5);
        String accessKey = rs.getString(6);
        key = new Key(id, status, createdAt, expiringAt, userId, accessKey);
      }
    } catch (SQLException e) {
      System.out.println("[KeyDao: FindById] - " + e.getMessage());
    }

    return key;
  }

  @Override
  public boolean deleteById(Integer id) {
    return deleteWithId(id);
  }

  @Override
  public boolean delete(Key entity) {
    return deleteWithId(entity.getId());
  }

  @Override
  public boolean create(Key entity) {
    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT)
    ) {
    // @formatter:on
      preparedStatement.setDate(1, java.sql.Date.valueOf(entity.getCreatedAt()));
      preparedStatement.setDate(2, java.sql.Date.valueOf(entity.getExpiringAt()));
      preparedStatement.setString(3, entity.getUserId());
      preparedStatement.setString(4, entity.getAccessKey());
      return preparedStatement.execute();
    } catch (SQLException e) {
      System.out.println("[KeyDao: Create] - " + e.getMessage());
      return false;
    }
  }

  @Override
  public Key update(Key entity) {
    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)
    ) {
    // @formatter:on
      preparedStatement.setString(1, entity.getStatus().toString());
      preparedStatement.execute();
    } catch (SQLException e) {
      System.out.println("[KeyDao: Update] - " + e.getMessage());
    }

    return entity;
  }

  private boolean deleteWithId(Integer id) {
    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID)
    ) {
    // @formatter:on
      preparedStatement.setInt(1, id);
      return preparedStatement.execute();
    } catch (SQLException e) {
      System.out.println("[KeyDao: Delete] - " + e.getMessage());
      return false;
    }
  }
}
