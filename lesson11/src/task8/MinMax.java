package task8;

import java.util.Arrays;
import java.util.Optional;

public class MinMax<T extends Comparable<T>> {
  private final T[] array;

  MinMax(T[] array) {
    this.array = array;
  }

  public T getMinElement() {
    Optional<T> minVal = Arrays.stream(array).reduce((min, current) -> current.compareTo(min) < 0 ? current : min);
    return minVal.orElse(null);
  }

  public T getMaxElement() {
    Optional<T> minVal = Arrays.stream(array).reduce((max, current) -> current.compareTo(max) > 0 ? current : max);
    return minVal.orElse(null);
  }
}
