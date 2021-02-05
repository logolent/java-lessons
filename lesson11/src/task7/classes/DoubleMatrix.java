package task7.classes;

public class DoubleMatrix extends GenericMatrix<Double> {
  @Override
  protected Double[][] instance(int rows, int columns) {
    return new Double[rows][columns];
  }

  @Override
  protected Double zero() {
    return 0.0;
  }

  @Override
  protected Double add(Double v1, Double v2) {
    return v1 + v2;
  }

  @Override
  protected Double multiply(Double v1, Double v2) {
    return v1 * v2;
  }
}
