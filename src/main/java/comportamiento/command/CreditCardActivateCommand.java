package comportamiento.command;

public class CreditCardActivateCommand implements Command{

  CreditCard creditCard;

  public CreditCardActivateCommand(CreditCard creditCard) {
    this.creditCard = creditCard;
  }


  @Override
  public void execute() {
    creditCard.sendPinNumberToCustomer();
    creditCard.activate();
    creditCard.sendSMSTOCustomerActivate();
    System.out.println(String.format("Card activated for %s", creditCard.getFirstName()));
  }
}
