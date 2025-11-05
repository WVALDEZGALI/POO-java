package H_OOP;

public class Person {

    // Attributes = characteristics

    String name;
    int age;

    // Builder

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods = function = actions

    public void sayHello() {
        System.out.println("Hello my name is: " + name + " ,and i have: " + age + " years old.");
    }

}
