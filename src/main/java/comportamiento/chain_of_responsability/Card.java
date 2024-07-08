package comportamiento.chain_of_responsability;

public class Card implements ApproveLoanChain {

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
      ApproveLoanChain gold = new Gold();
      this.setNextChain(gold);

      ApproveLoanChain platinium = new Platinium();
      gold.setNextChain(platinium);

      ApproveLoanChain black = new Black();
      platinium.setNextChain(black);
      next.creditCardRequest(amount);
  }
}
