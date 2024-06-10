package construccion.prototype;

public class Circle implements PrototypeShapes {

  private String radius;

  public String getRadius() {
    return radius;
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radius='" + radius + '\'' +
        '}';
  }

  public void setRadius(String radius) {
    this.radius = radius;
  }

  @Override
  public PrototypeShapes clone() throws CloneNotSupportedException {
    return (Circle) super.clone();
  }
}
