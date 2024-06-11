package construccion.factorymethod;

public class ButtonFactory {
  /**
   * Method factory the button
   * @param typeButton Type of button
   * @return Button
   */

  public static Button buildButton(TypeButton typeButton) {
        switch (typeButton) {
          case HTML:
                return new HtmlButton();
            case WINDOW:
            default:
                return new WindowButton();
        }
    }
}
