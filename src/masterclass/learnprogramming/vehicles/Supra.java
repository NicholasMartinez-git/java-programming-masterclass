/* Section 6 : Video 88: Inheritance Challenge Part 1 & 2 */

package masterclass.learnprogramming.vehicles;

public class Supra extends Car {

    private String bodyStyle;
    private int roadServiceMonths;

    public Supra(boolean cargo, int year, String color, int price, boolean isManual, String bodyStyle, int roadServiceMonths) {
        super(cargo, "Toyota", "Supra", year, color, price, 4, 2, isManual, 8);
        this.bodyStyle = bodyStyle;
        this.roadServiceMonths = roadServiceMonths;
    }

    @Override
    public void drive(double direction, int speed) {
        System.out.println("Supra.drive() called.");
        super.drive(direction, speed);
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Supra.accelerate() called.");
        super.accelerate(speed);
        int newSpeed = getSpeed();
        if (newSpeed > 0 && newSpeed <= 10) {
            super.shiftGear(1);
        } else if (newSpeed > 10 && newSpeed <= 20) {
            super.shiftGear(2);
        } else if (newSpeed > 20 && newSpeed <= 30) {
            super.shiftGear(3);
        } else if (newSpeed > 30 && newSpeed <= 40) {
            super.shiftGear(4);
        } else if (newSpeed > 40 && newSpeed <= 50) {
            super.shiftGear(5);
        } else if (newSpeed > 50 && newSpeed <= 60) {
            super.shiftGear(6);
        } else if (newSpeed > 60 && newSpeed <= 70) {
            super.shiftGear(7);
        } else if (newSpeed > 70 && newSpeed <= 80) {
            super.shiftGear(8);
        }
    }

    // Getters and Setters

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public int getRoadServiceMonths() {
        return roadServiceMonths;
    }

    public void setRoadServiceMonths(int roadServiceMonths) {
        this.roadServiceMonths = roadServiceMonths;
    }
}
