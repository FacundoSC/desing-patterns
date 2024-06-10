package comportamiento.strategy;

import java.util.Locale;

public class StrategyTextFormatLower implements StategyTextFormat {
  @Override
  public String format(String text) {
    return (text != null) ? text.toLowerCase(Locale.ROOT) : null;

  }
}
