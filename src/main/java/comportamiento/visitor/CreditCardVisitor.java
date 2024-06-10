package comportamiento.visitor;

public interface CreditCardVisitor {
  void ofertaGasolina(OfertaGasolina ofertaGasolina);
  void ofertaViaje(OfertaVuelos ofertaVuelos);
}
