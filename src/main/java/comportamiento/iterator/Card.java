package comportamiento.iterator;

public class Card {
  private String type;

  public Card(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "Card{" +
        "type='" + type + '\'' +
        '}';
  }
}
