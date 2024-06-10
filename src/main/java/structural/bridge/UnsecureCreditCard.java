package structural.bridge;

public class UnsecureCreditCard implements ICreditCard{
  @Override
  public void realizarPago() {
    System.out.println("Realizando pago SIN SEGURIDAD");
  }
}
