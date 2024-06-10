package comportamiento.strategy;

import java.util.Locale;

public class StrategyTextFormatUpper implements StategyTextFormat{
  @Override
  public String format(String text) {
    return (text != null) ? text.toUpperCase(Locale.ROOT) : null;
  }
}
