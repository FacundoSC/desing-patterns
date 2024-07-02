package estructural.adapter.v1;

public class Adapter implements Payment {
  Secure secureCreditCard;

  public Adapter(String type) {
    if (type.equalsIgnoreCase("gold")) {
      secureCreditCard = new GoldCreditCard();
    } else if (type.equalsIgnoreCase("black")) {
      secureCreditCard = new BlackCreditCard();
    }
  }

  @Override
  public void pay(String type) {
    if(type.equalsIgnoreCase("gold")) {
      secureCreditCard.payWithSecureLevelZ();
    } else if (type.equalsIgnoreCase("black")) {
      secureCreditCard.payWithSecureLevelA();
    } else {
      System.out.println("Invalid type");
    }

  }
}
