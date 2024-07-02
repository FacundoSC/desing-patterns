package estructural.flyweight;

public class Private implements Enemy{
  private String weapon;
  private final String LIFE;

  public Private() {
    LIFE = "200";
  }

  @Override
  public void setWeapon(String weapon) {

  }

  @Override
  public void lifePoints() {
    System.out.println("La vida del soldado privado es de " + LIFE + " puntos.");
  }
}
