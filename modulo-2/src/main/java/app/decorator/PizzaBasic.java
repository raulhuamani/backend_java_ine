package app.decorator;

public class PizzaBasic implements Pizza { // <1>

  @Override
  public String prepare() {
    return "Pizza Pepperoni";
  }

}
