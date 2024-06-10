package comportamiento.command;

public class CreditCardDesactivateCommand  implements Command{

  CreditCard creditCard;

  public CreditCardDesactivateCommand(CreditCard creditCard) {
    this.creditCard = creditCard;
  }


  @Override
  public void execute() {
    creditCard.desactivate();
    creditCard.sendSMSTOCustomerDesactivate();
    System.out.println(String.format("Card desactivated for %s", creditCard.getFirstName()));

  }
}
