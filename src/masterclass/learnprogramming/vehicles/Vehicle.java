/* Section 6 : Video 88: Inheritance Challenge Part 1 */

package masterclass.learnprogramming.vehicles;

public class Vehicle {

    private int speed;
    private double direction;
    private boolean cargo;

    public Vehicle(boolean cargo) {
        this.speed = 0;
        this.direction = 0;
        this.cargo = cargo;
    }

    public void steer(double direction) {
        System.out.println("Vehicle.steer() called.");

        /*
         * The direction could be elaborated as an angle ranging from 0-360 degrees
         * and when the angle is specified we can write an if-else statement declaring what cardinal direction the vehicle is moving.
         *
         * */

        if (direction < 0 || direction > 360) {
            System.out.println("Invalid direction!");
        } else if (direction == 0 || direction == 360) {
            System.out.println("0\u00B0 N");
        } else if (direction == 45) {
            System.out.println("45\u00B0 NE");
        } else if (direction < 45) {
            System.out.println(direction + "\u00B0 NNE");
        } else if (direction == 90) {
            System.out.println("90\u00B0 E");
        } else if (direction > 45 && direction < 90) {
            System.out.println(direction + "\u00B0 ENE");
        } else if (direction == 135) {
            System.out.println("135\u00B0 SE");
        } else if (direction > 90 && direction < 135) {
            System.out.println(direction + "\u00B0 ESE");
        } else if (direction == 180) {
            System.out.println("180\u00B0 S");
        } else if (direction > 135 && direction < 180) {
            System.out.println(direction + "\u00B0 SSE");
        } else if (direction == 225) {
            System.out.println("225\u00B0 SW");
        } else if (direction > 180 && direction < 225) {
            System.out.println(direction + "\u00B0 SSW");
        } else if (direction == 270) {
            System.out.println("270\u00B0 W");
        } else if (direction > 225 && direction < 270) {
            System.out.println(direction + "\u00B0 WSW");
        } else if (direction == 315) {
            System.out.println("315\u00B0 NW");
        } else if (direction > 270 && direction < 315) {
            System.out.println(direction + "\u00B0 WNW");
        } else if (direction > 315) {
            System.out.println(direction + "\u00B0 NNW");
        }

        this.direction += direction;
    }

    public void move(double direction, int speed) {
        System.out.println("Vehicle.move() called.");

        /*
         * All vehicles start from a rest position. In order to move we have to add speed to the vehicle.
         * So by adding an accelerated method to show speeding up while indicating a direction
         * we display the vehicle moving.
         *
         * */

        accelerate(speed);
        steer(direction);

    }

    public void accelerate(int speed) {

        // If the accelerate method is passed a negative number then the vehicle will be slowing down instead of speeding up

        System.out.println("Vehicle.accelerate() called.");
        this.speed += speed;
        if (this.speed <= 0) {
            stop();
        }
    }

    public void stop() {
        System.out.println("Vehicle.stop() called.");
        this.speed = 0;
    }



    // Getters and Setters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public boolean isCargo() {
        return cargo;
    }

    public void setCargo(boolean cargo) {
        this.cargo = cargo;
    }
}
