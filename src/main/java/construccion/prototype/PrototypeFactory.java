package construccion.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

  public static class ShapesType {
    public static final String CIRCLE = "circle";
    public static final String SQUARE = "square";
    public static final String RECTANGULE = "rectangule";
  }

  private static Map<String, PrototypeShapes> shapes = new HashMap<String, PrototypeShapes>();

  public static PrototypeShapes getShape(String shapeType) throws CloneNotSupportedException {
    PrototypeShapes cachedShape = shapes.get(shapeType);
    return cachedShape.clone();
  }

  public static void loadCache() {
    Circle circle = new Circle();
    circle.setRadius("10");
    shapes.put(ShapesType.CIRCLE, circle);

    Square square = new Square();
    square.setSide("10");
    shapes.put(ShapesType.SQUARE, square);

    Rectangule rectangule = new Rectangule();
    rectangule.setWidth("10");
    rectangule.setHeight("20");
  }

}
