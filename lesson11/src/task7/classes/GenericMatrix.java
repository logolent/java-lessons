package task7.classes;

public abstract class GenericMatrix<T extends Number> {
  public T[][] multiplyByNumber(T[][] matrix, T number) {
    final int rows = matrix.length;
    final int columns = matrix[0].length;

    T[][] result = this.instance(rows, columns);

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        result[i][j] = this.multiply(matrix[i][j], number);
      }
    }

    return result;
  }

  public T[][] addMatrices(T[][] m1, T[][] m2) {
    if (m1.length != m2.length || m1[0].length != m2[0].length) {
      return null;
    }

    final int rows = m1.length;
    final int columns = m1[0].length;

    T[][] result = this.instance(rows, columns);

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        result[i][j] = this.add(m1[i][j], m2[i][j]);
      }
    }

    return result;
  }

  public T[][] multiplyMatrices(T[][] m1, T[][] m2) {
    if (m1[0].length != m2.length) {
      System.out.println("Matrices cannot be multiplied");
      return null;
    }

    final int rows = m1.length;
    final int columns = m2[0].length;
    final int secondRows = m2.length;

    T[][] result = this.instance(rows, columns);

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        result[i][j] = this.zero();

        for (int k = 0; k < secondRows; k++) {
          result[i][j] = this.add(result[i][j], this.multiply(m1[i][k], m2[k][j]));
        }
      }
    }

    return result;
  }

  protected abstract T[][] instance(int rows, int columns);
  protected abstract T zero();
  protected abstract T add(T v1, T v2);
  protected abstract T multiply(T v1, T v2);

  public void print(T[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.format("%8.6s", matrix[i][j].toString());
      }
      System.out.println();
    }
  }
}
