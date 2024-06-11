package construccion.factorymethod;

public class WindowButton implements Button{
  @Override
  public void render() {
    System.out.println("Window Button");
    onClick();

  }

  @Override
  public void onClick() {
    System.out.println("Click! 'hello world'");
  }
}
