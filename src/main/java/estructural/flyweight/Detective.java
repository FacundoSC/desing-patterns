package estructural.flyweight;

public class Detective implements Enemy {
  private String weapon;
  private final String LIFE;

  public Detective() {
    LIFE = "100";
  }

  @Override
  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  @Override
  public void lifePoints() {
    System.out.println("La vida del detective es de " + LIFE + " puntos.");
  }
}
