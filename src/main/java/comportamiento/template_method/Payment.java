package comportamiento.template_method;

public abstract class Payment {


  //TODO: el metodo debe ser final para que no se pueda sobrescribir
  public final void makePayment() {
    validatePayment();
    processPayment();
    sendNotification();
  }

  protected abstract void validatePayment();

  protected abstract void processPayment();

  protected abstract void sendNotification();
}
