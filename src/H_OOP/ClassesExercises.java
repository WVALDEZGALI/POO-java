package H_OOP;

public class ClassesExercises {
    static void main(String[] args) {

        System.out.println();
        System.out.println("1. Create a Book class with title and author attributes. Create an object and display your data.");
        var book = new Book("The alchemist", "Paulo Coelho");
        System.out.println();
        book.Library();

        System.out.println();
        System.out.println("2. Create a Dog class with a bark() method that prints its sound.");
        var dog = new Dog("Guauuuuu");
        System.out.println();
        dog.saySound();

        System.out.println();
        System.out.println("3. Adds a constructor to the Book class that receives title and author.");
        System.out.println();
        System.out.println("In point 1.");

        System.out.println();
        System.out.println("4. Create a Car class with brand and model attributes and a showData() method.");
        var car = new Car("Toyota", "Corola");
        System.out.println();
        car.showData();

        System.out.println();
        System.out.println("5. Create a Student class with a score attribute and a method that says if I pass (greater than or equal to 60).");
        var student = new Student(60);
        System.out.println();
        student.studentScore();
    }
}
