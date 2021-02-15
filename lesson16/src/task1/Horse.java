package task1;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
  private String breed;

  public Horse(String name, String breed) {
    super(name);
    this.breed = breed;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public String toString() {
    return "Horse{" + "breed='" + breed + "'} " + super.toString();
  }
}
