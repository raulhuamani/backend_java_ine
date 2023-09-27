package app.model;

import lombok.Getter;
import lombok.ToString;
import lombok.Builder;
import lombok.EqualsAndHashCode;

@Getter
@ToString
@Builder
@EqualsAndHashCode
public class Person implements Comparable<Person> {
  private String name;
  private String lastName;
  private int age;

  @Override
  public int compareTo(Person o) {
    return this.getAge() - o.getAge();
  }
}
