package construccion.factorymethod;

public class ButtonFactory {
  /**
   * Method factory the button
   *
   * @return Button
   */

  public static Button createButton(TypeButton typeButton) {
    switch (typeButton) {
      case HTML:
        return new HtmlButton();
      case WINDOW:
        return new WindowButton();
      default:
        return null;
    }
  }
}
