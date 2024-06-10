package construccion.singleton;

import java.util.Objects;

public class Card {
  private static Card INSTANCE;

  // TODO atributos de la clase
  private String cardNumber;
  private Card() {
  }


  // TODO se usa la etiqueta synchronized para que el metodo sea thread safe por si dos o mas hilos intentan acceder al metodo al mismo tiempo
  public synchronized static Card getInstance() {
    if (Objects.isNull(INSTANCE)) {
      INSTANCE = new Card();
    }
    return INSTANCE;
  }
}
