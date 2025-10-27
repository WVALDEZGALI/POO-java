package H_OOP;

public class Person {

    // Attributes

    String name;
    int age;

    // Builder

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods

    public void sayHello() {
        System.out.println("Hello my name is: " + name + " ,and i have: " + age + " years old.");
    }

}
