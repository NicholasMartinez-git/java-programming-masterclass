/* Section 6 : Coding Exercise 33: Carpet Cost Calculator */

package masterclass.learnprogramming.carpetcostcalculator;

public class Carpet {
    public static void main(String[] args) {

    }

    private double cost;

    public Carpet(double cost) {

        if (cost < 0) {
            cost = 0;
        }

        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

//    public void setCost(double cost) {
//
//        if (cost < 0) {
//            cost = 0;
//        }
//
//        this.cost = cost;
//    }

}
