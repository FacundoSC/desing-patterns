package comportamiento.template_method;

public class Paypal extends Payment{
  @Override
  protected void validatePayment() {
    System.out.println("Validating payment with Paypal...");
  }

  @Override
  protected void processPayment() {
    System.out.println("Processing payment with Paypal...");

  }

  @Override
  protected void sendNotification() {
    System.out.println("Sending notification with Paypal...");
  }
}
