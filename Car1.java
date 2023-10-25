class Car1 extends Vehicle1 {
    int wheels;

    Car1(String type, int wheels) {
        super(type); // Call the base class constructor to initialize 'type'
        this.wheels = wheels;
    }

    void displayDetails() {
        System.out.println("Type: " + type);
        System.out.println("Wheels: " + wheels);
    }
}
