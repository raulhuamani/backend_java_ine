package builderpattern;

import java.util.logging.Logger;

public class Main {
  private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) {
    Person person = new Person.Builder()
        .Addres("Av Peru 10")
        .Name("Paolo")
        .Lastname("Guerrero")
        .Phone("976543454")
        .Age(40).build();
    if (person != null) {
      LOGGER.info(person.toString());
    }
  }
}
