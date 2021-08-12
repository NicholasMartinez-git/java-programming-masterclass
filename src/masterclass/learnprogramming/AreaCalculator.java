package masterclass.learnprogramming;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5, 4));
        System.out.println(area(-1, 4));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        double areaOfACircle = Math.PI * Math.pow(radius, 2);
        return areaOfACircle;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        double areaOfARectangle = x * y;
        return areaOfARectangle;
    }
}
