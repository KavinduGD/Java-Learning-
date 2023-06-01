package Inhertance;

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Number of doors: " + numberOfDoors);
    }
}