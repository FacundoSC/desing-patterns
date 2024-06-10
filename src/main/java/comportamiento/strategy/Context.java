package comportamiento.strategy;

public class Context {
  private StategyTextFormat strategy;

  public Context(StategyTextFormat strategy) {
    this.strategy = strategy;
  }

  public String format(String text) {
    return strategy.format(text);
  }

}
