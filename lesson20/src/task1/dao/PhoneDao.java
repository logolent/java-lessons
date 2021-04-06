package task1.dao;

import database.AbstractDao;
import database.DbConnector;
import task1.Phone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class PhoneDao extends AbstractDao<Phone, Integer> {
  private static final String SELECT_BY_ID = "SELECT * FROM phones WHERE id = ?";

  @Override
  public List<Phone> findAll() {
    return null;
  }

  @Override
  public Phone findById(Integer id) {
    Phone phone = null;

    // @formatter:off
    try (
      Connection connection = DbConnector.getConnection();
      PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID)
    ) {
    // @formatter:on
      preparedStatement.setInt(1, id);
      ResultSet set = preparedStatement.executeQuery();

      if (set.next()) {
        int userId = set.getInt(2);
        String phoneNumber = set.getString(3);

        phone = new Phone(id, userId, phoneNumber);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    return phone;
  }

  @Override
  public boolean deleteById(Integer id) {
    return false;
  }

  @Override
  public boolean delete(Phone entity) {
    return false;
  }

  @Override
  public boolean create(Phone entity) {
    return false;
  }

  @Override
  public Phone update(Phone entity) {
    return null;
  }
}
