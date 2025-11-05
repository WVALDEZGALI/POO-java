package H_OOP;

public class Dog {
    // Attributes = characteristics

    String bark;

    // Builder

    public Dog(String bark) {
        this.bark = bark;
    }

    // Methods = function = actions

    public void saySound() {
        System.out.println("This is a dog and its sound is a " + bark);
    }
}
