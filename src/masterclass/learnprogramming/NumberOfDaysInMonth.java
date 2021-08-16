/* Section 5 : Coding Exercise 13: Number Of Days In Month */

package masterclass.learnprogramming;

import static masterclass.learnprogramming.LeapYearCalculator.isLeapYear;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println("The number of days in month = " + getDaysInMonth(1, 2020));
        System.out.println("The number of days in month = " + getDaysInMonth(2, 2020));
        System.out.println("The number of days in month = " + getDaysInMonth(2, 2018));
        System.out.println("The number of days in month = " + getDaysInMonth(-1, 2020));
        System.out.println("The number of days in month = " + getDaysInMonth(1, -2020));
    }

    public static int getDaysInMonth(int month, int year) {

        int daysOfMonth;

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else if (month == 1) {
            daysOfMonth = 31;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                daysOfMonth = 29;
            } else {
                daysOfMonth = 28;
            }
        } else if (month == 3) {
            daysOfMonth = 31;
        } else if (month == 4) {
            daysOfMonth = 30;
        } else if (month == 5) {
            daysOfMonth = 31;
        } else if (month == 6) {
            daysOfMonth = 30;
        } else if (month == 7) {
            daysOfMonth = 31;
        } else if (month == 8) {
            daysOfMonth = 31;
        } else if (month == 9) {
            daysOfMonth = 30;
        } else if (month == 10) {
            daysOfMonth = 31;
        } else if (month == 11) {
            daysOfMonth = 30;
        } else {
            daysOfMonth = 31;
        }
        return daysOfMonth;
    }
}
