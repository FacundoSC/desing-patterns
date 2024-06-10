package structural.bridge;

public class SecureCreditCard implements ICreditCard{
  @Override
  public void realizarPago() {
    System.out.println("Realizando pago CON SEGURIDAD");
  }
}
