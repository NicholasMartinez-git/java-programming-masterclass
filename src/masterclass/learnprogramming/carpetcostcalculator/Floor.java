/* Section 6 : Coding Exercise 33: Carpet Cost Calculator */

package masterclass.learnprogramming.carpetcostcalculator;

public class Floor {
    public static void main(String[] args) {

    }

    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0) {
            width = 0;
        }

        if (length < 0) {
            length = 0;
        }

        this.width = width;
        this.length = length;
    }

//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//
//        if (width < 0) {
//            width = 0;
//        }
//
//        this.width = width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//
//        if (height < 0) {
//            height = 0;
//        }
//
//        this.height = height;
//    }

    public double getArea() {
        return length * width;
    }
}
