package comportamiento.mediator;

public class ConcreteColleageTwo extends Colleage {
  public ConcreteColleageTwo(Mediator mediator) {
    super(mediator);
  }

  public void send(String message) {
    mediator.sendMessage(message, this);
  }

  public void receive(String message) {
    System.out.println("ConcreteColleageTwo ha recibido el mensaje: " + message);
  }
}
