/* Section 4 : Coding Exercise 4: Leap Year Calculator */

package masterclass.learnprogramming;

public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(2400));
        System.out.println(isLeapYear(2500));
        System.out.println(isLeapYear(2600));
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2028));
        System.out.println(isLeapYear(2032));
        System.out.println(isLeapYear(2034));
    }

    public static boolean isLeapYear(int year) {
        boolean evenlyDivisibleBy4 = ((year % 4) == 0);
        boolean evenlyDivisibleBy100 = ((year % 100) == 0);
        boolean evenlyDivisibleBy400 = ((year % 400) == 0);

        if (year < 1 || year > 9999) {
            return false;
        } else if (evenlyDivisibleBy4) {
            if (evenlyDivisibleBy100) {
                return evenlyDivisibleBy400;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
