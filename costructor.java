class Car {
    String brand;
    String model;
    int year;

    // Constructor
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("This car is a " + year + " " + brand + " " + model + ".");
    }
}

public class costructor {
    public static void main(String[] args) {
        // Creating an object
        Car myCar = new Car("Toyota", "Corolla", 2022);
        Car my=new Car("Suzuki","Baleno",2021);
        myCar.displayInfo();
        my.displayInfo();
    }
}
