package builderpattern;

public class Person {

  private final String name;
  private final String addres;
  private final String lastname;
  private final String phone;
  private final Integer age;

  public static class Builder {
    private String name = "";
    private String addres = "";
    private String lastname = "";
    private String phone = "00000";
    private Integer age = 10;

    public Builder() {

    }

    public Builder Name(String name) {
      this.name = name;
      return this;
    }

    public Builder Addres(String addres) {
      this.addres = addres;
      return this;
    }

    public Builder Lastname(String lastname) {
      this.lastname = lastname;
      return this;
    }

    public Builder Phone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder Age(Integer age) {
      this.age = age;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }

  public Person(Builder builder) {
    name = builder.name;
    addres = builder.addres;
    lastname = builder.lastname;
    phone = builder.phone;
    age = builder.age;
  }

  public String getAddres() {
    return addres;
  }

  public Integer getAge() {
    return age;
  }

  public String getLastname() {
    return lastname;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  @Override
  public String toString() {
    return "La persona " + name + " " + lastname + " -> addres=" + addres + ", phone=" + phone + ", age=" + age;
  }

}
