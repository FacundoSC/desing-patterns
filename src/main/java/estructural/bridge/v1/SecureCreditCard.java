package estructural.bridge.v1;

public class SecureCreditCard implements ICreditCard {
  @Override
  public void realizarPago() {
    System.out.println("Realizando pago CON SEGURIDAD");
  }
}
