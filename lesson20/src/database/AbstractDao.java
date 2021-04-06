package database;

import java.util.List;

public abstract class AbstractDao<T, K> {
  public abstract List<T> findAll();
  public abstract T findById(K id);
  public abstract boolean deleteById(K id);
  public abstract boolean delete(T entity);
  public abstract boolean create(T entity);
  public abstract T update(T entity);
}
