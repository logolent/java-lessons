package task2.dao;

import database.AbstractDao;
import database.DbConnector;
import task2.StatusEnum;
import task2.entities.File;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FileDao extends AbstractDao<File, Integer> {
  private static final String SELECT_ALL = "SELECT * FROM files";
  private static final String SELECT_BY_ID = "SELECT * FROM files WHERE id = ?";
  private static final String DELETE_BY_ID = "DELETE FROM files WHERE id = ?";
  private static final String INSERT = "INSERT INTO files (file_name, original_name, mime, user_id) VALUES (?, ?, ?, ?)";
  private static final String UPDATE = "UPDATE files SET status = ? WHERE id = ?";

  @Override
  public List<File> findAll() {
    List<File> files = new ArrayList<>();

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
        String fileName = rs.getString(3);
        String originalName = rs.getString(4);
        String mime = rs.getString(5);
        String userId = rs.getString(6);
        files.add(new File(id, status, fileName, originalName, mime, userId));
      }
    } catch (SQLException e) {
      System.out.println("[FileDao: FindAll] - " + e.getMessage());
    }

    return files;
  }

  @Override
  public File findById(Integer id) {
    File file = null;

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
        String fileName = rs.getString(3);
        String originalName = rs.getString(4);
        String mime = rs.getString(5);
        String userId = rs.getString(6);
        file = new File(id, status, fileName, originalName, mime, userId);
      }
    } catch (SQLException e) {
      System.out.println("[FileDao: FindById] - " + e.getMessage());
    }

    return file;
  }

  @Override
  public boolean deleteById(Integer id) {
    return deleteWithId(id);
  }

  @Override
  public boolean delete(File entity) {
    return deleteWithId(entity.getId());
  }

  @Override
  public boolean create(File entity) {
    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT)
    ) {
    // @formatter:on
      preparedStatement.setInt(1, entity.getId());
      preparedStatement.setString(2, entity.getFileName());
      preparedStatement.setString(3, entity.getOriginalName());
      preparedStatement.setString(4, entity.getMime());
      preparedStatement.setString(5, entity.getUserId());
      return preparedStatement.execute();
    } catch (SQLException e) {
      System.out.println("[FileDao: Create] - " + e.getMessage());
      return false;
    }
  }

  @Override
  public File update(File entity) {
    // @formatter:off
    try (
        Connection connection = DbConnector.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)
    ) {
    // @formatter:on
      preparedStatement.setString(1, entity.getStatus().toString());
      preparedStatement.execute();
    } catch (SQLException e) {
      System.out.println("[FileDao: Update] - " + e.getMessage());
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
      System.out.println("[FileDao: Delete] - " + e.getMessage());
      return false;
    }
  }
}
