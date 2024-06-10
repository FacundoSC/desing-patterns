package comportamiento.visitor;

public class OfertaVuelos implements OfertaElement {
  @Override
  public void accept(CreditCardVisitor visitor) {
    visitor.ofertaViaje(this);
  }
}
