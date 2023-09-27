package app;

import app.collections.MyCollections;
import app.decorator.MyDecorator;
import app.genericos.MyGeneric;
import app.minterface.MyInterface;
import app.model.Person;

public class Main {

  public static void print(String value) {
    System.out.println(value);
  }

  public static void main(String[] args) {
    MyCollections.execute();

    print("-----------------------------");
    MyGeneric.execute();

    print("-----------------------------");
    MyDecorator.execute();

    print("-----------------------------");
    MyInterface.execute();

    print("-----------------------------");
    Person person1 = Person.builder()
        .name("Raul")
        .lastName("Huamani")
        .age(30)
        .build();

    print(person1.toString());
    print(person1.getName());
  }
}