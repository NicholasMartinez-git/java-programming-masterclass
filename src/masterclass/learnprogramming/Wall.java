/* Section 6 : Coding Exercise 31: Wall Area */

package masterclass.learnprogramming;

public class Wall {
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("Area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());
    }

    private double width;
    private double height;

    public Wall() {}

    public Wall(double width, double height) {

        if (width < 0) {
            width = 0;
        }

        if (height < 0) {
            height = 0;
        }

        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return height * width;
    }
}
