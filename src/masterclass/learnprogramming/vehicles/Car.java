package masterclass.learnprogramming.vehicles;

public class Car extends Vehicle {

    private String make;
    private String model;
    private int year;
    private String color;
    private int price;
    private int wheels;
    private int doors;
    private boolean isManual;
    private int gears;
    private int currentGear;

    public Car(boolean cargo, String make, String model, int year, String color, int price, int wheels, int doors, boolean isManual, int gears) {
        super(cargo);
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.gears = gears;
        this.currentGear = 0;
    }

    public void start() {
        System.out.println("Car.start() called.");
        System.out.println("Engine ON!");
    }

    public void park() {
        super.stop();
        System.out.println("Engine OFF!");
    }

    public void drive(double direction, int speed) {
        System.out.println("Car.drive() called.");
        super.move(direction, speed);
    }

    public void shiftGear(int currentGear) {
        setCurrentGear(currentGear);
    }

    // Getters and Setters

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
