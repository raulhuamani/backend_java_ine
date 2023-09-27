package helloworld;

class MyfirstClassJava {

    String name;
    int age;

    public static void main(String[] args) {
        System.out.println("Hello Word");

        int intNumber = 1000;
        long longNumber = 1000L;
        double doubleNumber = 0;
        boolean booleanVariable = true;

        Integer intWrapper = intNumber;

        String stringVariable = "Hola mundo String";

        System.out.println(doubleNumber);
        System.out.println(stringVariable);

        System.out.println(intNumber);
        System.out.println(longNumber);
        System.out.println(doubleNumber);
        System.out.println(booleanVariable);
        System.out.println(intWrapper);
    }
}