package comportamiento.command;

public class CreditCard {

  private String firstName;

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getFirstName() {
    return firstName;
  }

  public void sendPinNumberToCustomer() {
    System.out.println("Sending PIN number to customer");
  }

  public void sendSMSTOCustomerActivate() {
    System.out.println("Sending SMS to customer to activate the Card");
  }

  public void activate() {
    System.out.println("Activating the Card");
  }

  public void desactivate() {
    System.out.println("Desactivating the Card");
  }

  public void sendSMSTOCustomerDesactivate() {
    System.out.println("Sending SMS to customer to desactivate the Card");
  }

}
