package comportamiento.chain_of_responsability;

public class Platinium implements ApproveLoanChain {

  private ApproveLoanChain next;

  @Override
  public void setNextChain(ApproveLoanChain nextChain) {
    next = nextChain;
  }

  @Override
  public ApproveLoanChain getNextChain() {
    return next;
  }

  @Override
  public void creditCardRequest(int amount) {
    if (1000 < amount && amount <= 50000) {
      System.out.println("This request is handled by Platinium Card");
    } else {
      getNextChain().creditCardRequest(amount);
    }

  }
}
