package estructural.flyweight;

import java.util.HashMap;

public class EnemyFactory {
  private static HashMap<String, Enemy> enemies = new HashMap<>();
  public static Enemy getEnemy(String type) {
    Enemy enemy = enemies.get(type);
    if (enemy == null) {
      switch (type) {
        case "Private":
          enemy = new Private();
          break;
        case "Detective":
          enemy = new Detective();
          break;
      }
      enemies.put(type, enemy);
    }
    return enemy;
  }
}
