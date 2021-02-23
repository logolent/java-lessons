package maven;

/**
 * The {@code Matrix} class that includes methods for operations on matrices.
 */
public class Matrix {

  /**
   * {@code Matrix} inner array.
   */
  private double[][] array;

  /**
   * {@code Matrix} rows count.
   */
  private int rows;

  /**
   * {@code Matrix} columns count.
   */
  private int columns;

  /**
   * Initializes a new {@code Matrix} object with given {@code matrixArray}.
   *
   * @param matrixArray double[][]
   */
  public Matrix(final double[][] matrixArray) {
    rows = matrixArray.length;
    columns = matrixArray[0].length;
    array = cloneArray(matrixArray);
  }

  /**
   * Multiplies current {@code Matrix} by given {@code number}.
   *
   * @param number double
   * @return new {@code Matrix} object
   */
  public Matrix multiplyByNumber(final double number) {
    Matrix result = new Matrix(cloneArray(this.array));
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        result.array[i][j] *= number;
      }
    }
    return result;
  }

  /**
   * Sums current {@code Matrix} with given {@code matrix}.
   *
   * @param matrix Matrix
   * @return new {@code Matrix} object
   */
  public Matrix add(final Matrix matrix) {
    Matrix result = new Matrix(cloneArray(this.array));
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        result.array[i][j] += matrix.array[i][j];
      }
    }
    return result;
  }

  /**
   * Miltiplies current {@code matrix} with given {@code matrix}.
   *
   * @param matrix Matrix
   * @return new {@code Matrix} object
   */
  public Matrix multiply(final Matrix matrix) {
    if (this.columns != matrix.rows) {
      System.out.println("Matrices cannot be multiplied");
      return null;
    }

    int rows = this.rows;
    int columns = matrix.columns;

    double[][] newMatrixArray = new double[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {

        for (int k = 0; k < matrix.rows; k++) {
          newMatrixArray[i][j] += this.array[i][k] * matrix.array[k][j];
        }
      }
    }

    return new Matrix(newMatrixArray);
  }

  /**
   * Prints current {@code Matrix} to console.
   */
  public void print() {
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.format("%8.1f", array[i][j]);
      }
      System.out.println();
    }
  }

  /**
   * Clones {@code array} into current {@code Matrix} inner {@code array}.
   *
   * @param array double[][]
   * @return cloned double[][] {@code array}
   */
  private double[][] cloneArray(final double[][] array) {
    double[][] newArray = new double[array.length][array[0].length];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i].clone();
    }
    return newArray;
  }
}
