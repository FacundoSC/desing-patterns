package comportamiento.chain_of_responsability;

import comportamiento.chain_of_responsability.ApproveLoanChain;

public class Black implements ApproveLoanChain {

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
    if(amount > 50000) {
      System.out.println("This request is handled by Black Card");
    }
  }
}
