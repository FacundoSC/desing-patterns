package construccion.prototype;

public class Rectangule implements PrototypeShapes{
  private String width;
  private String height;

  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  @Override
  public PrototypeShapes clone() throws CloneNotSupportedException {
    return null;
  }
}
