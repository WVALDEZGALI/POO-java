package H_OOP;

public class Car {

    String brand;
    String model;

    public Car(String brand, String model){

        this.brand = brand;
        this.model = model;

    }

    public void showData(){
        System.out.println("This is a brand " + brand + " car, and its model is " + model);
    }

}

