package Composition;


class Car {
    private String make;
    private Engine engine;
    
    public Car(String make, String engineType) {
        this.make = make;
        this.engine = new Engine(engineType);
    }
    
    public void startCar() {
        engine.start();
        System.out.println("Car started.");
    }
}