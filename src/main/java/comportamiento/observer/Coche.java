package comportamiento.observer;

public class Coche implements Observer{
  @Override
  public void update(Semaforo semaforo) {
    if ("Verde".equals(semaforo.getStatus())) {
      System.out.println("Semaforo Verde para coche: -> Coche SI puede pasar");
    } else {
      System.out.println("Semaforo Rojo para coche: -> Coche NO puede pasar");
    }
  }
}
