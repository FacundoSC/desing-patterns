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
      Gold gold = new Gold();
      this.setNextChain(gold);

      Platinium platinium = new Platinium();
      gold.setNextChain(platinium);

      Black black = new Black();
      platinium.setNextChain(black);

      next.creditCardRequest(amount);
  }
}
