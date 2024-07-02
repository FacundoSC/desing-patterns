package estructural.bridge.v1;

public class UnsecureCreditCard implements ICreditCard {
  @Override
  public void realizarPago() {
    System.out.println("Realizando pago SIN SEGURIDAD");
  }
}
