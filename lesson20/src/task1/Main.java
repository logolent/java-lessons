package task1;

import task1.dao.PhoneDao;

public class Main {
  public static void main(String[] args) {
    PhoneDao phoneDao = new PhoneDao();

    Phone phone = phoneDao.findById(2);
    System.out.println(phone);
  }
}
