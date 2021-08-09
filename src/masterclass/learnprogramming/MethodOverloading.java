/* Section 4 : Video 58 */

package masterclass.learnprogramming;

public class MethodOverloading {
    public static void main(String[] args) {
        String strDouble = String.format("%.2f", calcFeetAndInchesToCentimeters(10, 7));
        System.out.println(strDouble);
        String strDouble2 = String.format("%.2f", calcFeetAndInchesToCentimeters(127));
        System.out.println(strDouble2);
    }

    public static boolean validation(double feet, double inches) {
        return (feet >= 0) && (inches >= 0 && inches <= 12);
    }

    public static boolean validation(double inches) {
        return (inches >= 0);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        // 1 ft. = 30.48 cm
        // 1 in. = 2.54 cm
        if (validation(feet, inches)) {
            return (feet * 30.48) + (inches * 2.54);
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        // 1 ft. = 30.48 cm
        // 1 in. = 2.54 cm
        if (validation(inches)) {
            double feetWithDecimal = inches / 12;
            int feetWithNoDecimal = (int) feetWithDecimal % 12;
            double remainingInches = (feetWithDecimal - feetWithNoDecimal) * 12;
            return calcFeetAndInchesToCentimeters(feetWithNoDecimal, remainingInches);
        } else {
            return -1;
        }
    }
}
