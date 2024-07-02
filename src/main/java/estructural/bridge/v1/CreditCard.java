package estructural.bridge.v1;

public abstract class CreditCard {
 protected ICreditCard tarjeta;
 protected CreditCard(ICreditCard tarjeta) {
   this.tarjeta = tarjeta;
 }
 public abstract void realizarPago();

}
