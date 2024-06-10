package structural.adapter;

public class CreditCard implements Payment{
  Adapter adapter;
  @Override
  public void pay(String type) {
    if (type.equalsIgnoreCase("classic")) {
      System.out.println("Paying without security");
    } else if (type.equalsIgnoreCase("gold")) {
      adapter = new Adapter(type);
      adapter.pay(type);
    }
    else if (type.equalsIgnoreCase("black")) {
      adapter = new Adapter(type);
      adapter.pay(type);
    } else {
      System.out.println("Invalid type");
    }
  }
}
