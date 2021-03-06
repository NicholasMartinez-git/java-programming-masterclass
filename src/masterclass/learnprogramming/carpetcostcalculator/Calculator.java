/* Section 6 : Coding Exercise 33: Carpet Cost Calculator */

package masterclass.learnprogramming.carpetcostcalculator;

public class Calculator {
    public static void main(String[] args) {

    }

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}
