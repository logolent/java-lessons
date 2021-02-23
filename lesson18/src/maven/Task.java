package maven;

final class Task {
  /**
   * Entry point.
   *
   * @param args String[]
   */
  public static void main(final String[] args) {
    double[][] array = {
        { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 }
    };

    Matrix matrix = new Matrix(array);
    matrix.multiplyByNumber(2);
    matrix.add(matrix);
    matrix.multiply(matrix);
    matrix.print();
  }
}
