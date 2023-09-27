package herencia;

public abstract class Person {
  private String name;
  private String addres;
  private String lastname;
  private String phone;
  private Integer age;

  public Person(String name, String addres, String lastname, String phone, Integer age) {
    this.name = name;
    this.addres = addres;
    this.lastname = lastname;
    this.phone = phone;
    this.age = age;
  }

  protected abstract String greetings();

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
