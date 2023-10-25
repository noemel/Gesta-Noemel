class Car extends Vehicle {
    Car(String type) {
        super(type); // Call the base class constructor
    }

    // Override the start method
    @Override
    void start() {
        super.start(); // Call the base class method
        System.out.println("Car is starting.");
    }
}