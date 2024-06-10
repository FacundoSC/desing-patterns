package comportamiento.visitor;

public class ClassicCreditCardVisitor implements CreditCardVisitor{
  @Override
  public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
    System.out.println("Oferta de gasolina para tarjeta clásica");

  }

  @Override
  public void ofertaViaje(OfertaVuelos ofertaVuelos) {
    System.out.println("Oferta de viaje para tarjeta clásica");
  }
}
