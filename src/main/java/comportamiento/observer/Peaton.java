package comportamiento.observer;

public class Peaton implements Observer{
  @Override
  public void update(Semaforo semaforo) {
    if ("Verde".equals(semaforo.getStatus())) {
      System.out.println("Semaforo Verde para peatón: -> Peaton NO puede cruzar");
    } else {
      System.out.println("Semaforo Rojo para peatón: -> Peaton SI puede cruzar");
    }
  }
}
