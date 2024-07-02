package estructural.adapter.v1;

public class GoldCreditCard implements Secure {
  @Override
  public void payWithSecureLevelA() {
  //Todo no implementar
  }

  @Override
  public void payWithSecureLevelZ() {
    System.out.println(" Gold Card:Paying with secure level Z");
  }
}
