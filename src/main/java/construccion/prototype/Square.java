package construccion.prototype;

public class Square  implements PrototypeShapes{
  private String side;

  public String getSide() {
    return side;
  }

  public void setSide(String side) {
    this.side = side;
  }

  @Override
  public PrototypeShapes clone() throws CloneNotSupportedException {
    return (Square) super.clone();
  }
}
