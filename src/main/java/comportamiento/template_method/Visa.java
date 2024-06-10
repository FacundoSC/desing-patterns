package comportamiento.template_method;

public class Visa  extends Payment {
  @Override
  protected void validatePayment() {
    System.out.println("Validating payment with Visa...");
  }

  @Override
  protected void processPayment() {
    System.out.println("Processing payment with Visa...");
  }

  @Override
  protected void sendNotification() {
    System.out.println("Sending notification with Visa...");
  }
}
