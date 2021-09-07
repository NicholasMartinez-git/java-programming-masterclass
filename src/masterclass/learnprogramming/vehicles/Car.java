package masterclass.learnprogramming.vehicles;

public class Car extends Vehicle {

    private int wheels;

    public Car(String make, String model, int year, int speed, int direction, boolean motorized, boolean cargo, boolean moving) {
        super(make, model, year, speed, direction, motorized, cargo, moving);
    }
}
