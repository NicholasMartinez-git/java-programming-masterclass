package masterclass.learnprogramming.vehicles;

public class Car extends Vehicle {

    private int wheels;

    public Car(boolean cargo) {
        super(cargo);
    }

    // Speed up the motorized vehicle
    public void changeGearUp(int speed) {
        System.out.println("Vehicle.changeGearUp() called.");
        System.out.println("Vehicles gears have been shifted up");
        speed += 10;
    }

    // Slow down the motorized vehicle
    public void changeGearDown(int speed) {
        System.out.println("Vehicle.changeGearDown() called.");
        System.out.println("Vehicles gears have been shifted down");
        speed -= 10;
    }

//    public void checkSpeed(int speed) {
//        if (speed <= 0) {
//            moving = false;
//        }
//    }

    public void startMotor() {
        System.out.println("Vehicle.startMotor() called.");
        System.out.println("Motor has been TURNED ON!");
    }

    public void stopMotor() {
        System.out.println("Vehicle.stopMotor() called.");
        System.out.println("Motor has been TURNED OFF!");
    }
}
