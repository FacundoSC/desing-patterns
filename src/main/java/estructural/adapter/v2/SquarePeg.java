package estructural.adapter.v2;

public class SquarePeg {
  private double width;

  public SquarePeg(int width) {
    this.width = width;
  }

  public double getWidth() {
    return width;
  }
  public double getSquare() {
    return Math.pow(width, 2);
  }

  public double getPerimeter() {
    return 4 * width;
  }
}
