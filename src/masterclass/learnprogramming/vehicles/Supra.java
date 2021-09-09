package masterclass.learnprogramming.vehicles;

public class Supra extends Car {

    private String bodyStyle;
    private int roadServiceMonths;

    public Supra(boolean cargo, int year, String color, int price, int wheels, int doors, boolean isManual, int gears, String bodyStyle, int roadServiceMonths) {
        super(cargo, "Toyota", "Supra", year, color, price, wheels, doors, isManual, gears);
        this.bodyStyle = bodyStyle;
        this.roadServiceMonths = roadServiceMonths;
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
