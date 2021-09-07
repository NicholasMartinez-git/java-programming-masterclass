/* Section 6 : Video 88: Inheritance Challenge Part 1 */

package masterclass.learnprogramming.vehicles;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private int speed;
    private int direction;
    private boolean motorized;
    private boolean cargo;
    private boolean moving;

    public Vehicle(String make, String model, int year, boolean motorized, boolean cargo) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
        this.direction = 0;
        this.motorized = motorized;
        this.cargo = cargo;
        this.moving = false;
    }

    public void steer(int direction) {
        System.out.println("Vehicle.steer() called.");

        /*
         * The direction could be elaborated as an angle ranging from 0-360 degrees
         * and when the angle is specified we can write an if-else statement declaring what cardinal direction the vehicle is moving.
         *
         * */
    }

    public void moving() {

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

    public void checkSpeed(int speed) {
        if (speed <= 0) {
            moving = false;
        }
    }

    public void startMotor() {
        System.out.println("Vehicle.startMotor() called.");
        System.out.println("Motor has been TURNED ON!");
    }

    public void stopMotor() {
        checkSpeed(speed);
        System.out.println("Vehicle.stopMotor() called.");
        System.out.println("Motor has been TURNED OFF!");
    }
}
