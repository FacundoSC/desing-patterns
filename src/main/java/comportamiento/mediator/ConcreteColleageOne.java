package comportamiento.mediator;

public class ConcreteColleageOne extends Colleage {
  public ConcreteColleageOne(Mediator mediator) {
    super(mediator);
  }

  public void send(String message) {
    mediator.sendMessage(message, this);

  }

  public void receive(String message) {
    System.out.println("ConcreteColleageOne ha recibido el mensaje: " + message);
  }
}
