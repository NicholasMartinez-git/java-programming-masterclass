package masterclass.learnprogramming;

public class Point {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("Distance(0,0) = " + first.distance());
        System.out.println("Distance(2,2) = " + first.distance(2,2));
        System.out.println("Distance(second) = " + first.distance(second));
        Point point = new Point();
        System.out.println("Distance(0,0) = " + point.distance());
    }

    private int x;
    private int y;

    public Point() {}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));
    }

    public double distance(int x, int y) {
        return Math.sqrt(((getX() - x) * (getX() - x)) + ((getY() - y) * (getY() - y)));
    }
    public double distance(Point point) {
        return Math.sqrt(((getX() - point.getX()) * (getX() - point.getX())) + ((getY() - point.getY()) * (getY() - point.getY())));
    }
}
