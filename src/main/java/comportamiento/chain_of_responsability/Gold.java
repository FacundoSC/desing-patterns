package comportamiento.chain_of_responsability;

public class Gold implements ApproveLoanChain {
  private ApproveLoanChain next;
  @Override
  public void setNextChain(ApproveLoanChain loan) {
    next = loan;

  }

  @Override
  public ApproveLoanChain getNextChain() {
    return next;
  }

  @Override
  public void creditCardRequest(int amount) {
    if (amount <= 1000) {
      System.out.println("This request is handled by Gold Card");
    } else {
      getNextChain().creditCardRequest(amount);
    }
  }
}
