package herencia;

public class Main {

  public static void main(String[] args) {
    // Person person = new Person("Raul", "Av Peru 333", "Huamani", "989365241",35);
    // System.out.println(person);

    Student student = new Student("Luciana", "Calle Jazmines", "Huamani", "968254125", 5, CollegeCareer.MATH);
    Profesor profesor = new Profesor("Juan", "Av Lima 777", "Perez", "986542142", 25);

    System.out.println(student.greetings());
    System.out.println(profesor.greetings());

    System.out.println(student.getCareer());
    System.out.println(student.getName());
    System.out.println(student.getLastname());

  }
}
