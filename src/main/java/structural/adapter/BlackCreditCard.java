package structural.adapter;

public class BlackCreditCard implements Secure{
  @Override
  public void payWithSecureLevelA() {
    System.out.println(" Black Card:Paying with secure level A");
  }

  @Override
  public void payWithSecureLevelZ() {
   //TODO no implementar
  }
}
