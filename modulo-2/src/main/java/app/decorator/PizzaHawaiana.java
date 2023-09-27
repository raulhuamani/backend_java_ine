package app.decorator;

public class PizzaHawaiana implements Pizza { // <1>

  @Override
  public String prepare() {
    return "Pizza Hawaiana";
  }

}
