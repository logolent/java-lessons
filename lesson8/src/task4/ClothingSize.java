package task4;

public enum ClothingSize {
  XXS(32) {
    @Override
    public String getDescription() {
      return "Детский размер";
    }
  }, XS(34), S(36), M(38), L(40);

  private final int euroSize;

  ClothingSize(int euroSize) {
    this.euroSize = euroSize;
  }

  public String getDescription() {
    return "Взрослый размер";
  }

  public int getEuroSize() {
    return euroSize;
  }
}
