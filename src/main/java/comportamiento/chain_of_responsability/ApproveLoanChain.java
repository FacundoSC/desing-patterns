package comportamiento.chain_of_responsability;

//TODO: Handler para aprobar la tarjeta de credito
public interface ApproveLoanChain {
  void setNextChain(ApproveLoanChain nextChain);
  ApproveLoanChain getNextChain();
  void creditCardRequest(int amount);
}
