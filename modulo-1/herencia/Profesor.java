package herencia;

public class Profesor extends Person {

  public Profesor(String name, String addres, String lastname, String phone, Integer age) {
    super(name, addres, lastname, phone, age);
  }

  @Override
  protected String greetings() {
    return "El saludo del profesor";
  }

}
