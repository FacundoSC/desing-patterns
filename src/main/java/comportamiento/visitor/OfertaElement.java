package comportamiento.visitor;

public interface OfertaElement {
  void accept(CreditCardVisitor visitor);
}
