package structural.bridge;

public class ClassicCreditCard extends CreditCard{
  public ClassicCreditCard(ICreditCard tarjeta) {
    super(tarjeta);
  }

  @Override
  public void realizarPago() {
    System.out.println("Pago realizado con tarjeta de crédito clásica");
    tarjeta.realizarPago();
  }
}
