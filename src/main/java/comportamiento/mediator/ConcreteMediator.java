package comportamiento.mediator;

public class ConcreteMediator implements Mediator {
  private ConcreteColleageOne user1;

  private ConcreteColleageTwo user2;

  public void setUser1(ConcreteColleageOne user1) {
    this.user1 = user1;
  }

  public void setUser2(ConcreteColleageTwo user2) {
    this.user2 = user2;
  }

  @Override
  public void sendMessage(String message, Colleage colleage) {
    if (colleage == user1) {
      user2.receive(message);
    } else if(colleage == user2) {
      user1.receive(message);
    }

  }
}
