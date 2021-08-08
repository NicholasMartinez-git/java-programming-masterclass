/* Section 4 : Coding Exercise 5: Decimal Comparator */

package masterclass.learnprogramming;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        double value1 = (num1 * 1000);
        double value2 = (num2 * 1000);
        int castedValue1 = (int) value1;
        int castedValue2 = (int) value2;
        return castedValue1 == castedValue2;
    }
}
