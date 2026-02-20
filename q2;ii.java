public class Car extends Vehicle {

    
    private String fuelType;

    
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);  // Call parent class constructor
        this.fuelType = fuelType;
    }

    
    
    public void displayDetails() {
        super.displayDetails();  // Display vehicle details
        System.out.println("Fuel Type: " + fuelType);
    }

   
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022, "Petrol");
        car1.displayDetails();
    }
}

