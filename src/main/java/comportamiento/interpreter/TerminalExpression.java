package comportamiento.interpreter;

public class TerminalExpression implements Expression {
  private String text;

  public TerminalExpression(String text) {
    this.text = text;
  }

  @Override
  public Boolean interpret(String context) {
    return context.contains(text);
  }
}
