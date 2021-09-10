package masterclass.learnprogramming.cylinder;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double getArea() {
        return (radius * radius * Math.PI);
    }


    // Getter and Setters

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
