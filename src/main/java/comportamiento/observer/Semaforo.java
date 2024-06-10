package comportamiento.observer;

public class Semaforo {
  private String status;

  public Semaforo(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }
}
