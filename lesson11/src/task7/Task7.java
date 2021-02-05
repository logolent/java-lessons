package task7;

import task7.classes.DoubleMatrix;

public class Task7 {
  public static void main(String[] args) {
    Double[][] matrix1 = {
        { 11.0, 42.0, 15.1 }, { 42.1, 36.0, 9.1 }, { 2.1, 3.9, 19.9 },
    };
    DoubleMatrix doubleMatrix = new DoubleMatrix();
    System.out.println("matrix1:");
    doubleMatrix.print(matrix1);

    Double[][] result;

    System.out.println("matrix1 * 2 ->");
    result = doubleMatrix.multiplyByNumber(matrix1, 2.0);
    doubleMatrix.print(result);

    System.out.println("matrix1 + matrix1 ->");
    result = doubleMatrix.addMatrices(matrix1, matrix1);
    doubleMatrix.print(result);

    System.out.println("matrix1 * matrix1 ->");
    result = doubleMatrix.multiplyMatrices(matrix1, matrix1);
    doubleMatrix.print(result);
  }
}
