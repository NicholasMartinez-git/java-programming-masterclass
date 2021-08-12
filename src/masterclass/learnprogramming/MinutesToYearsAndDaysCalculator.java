package masterclass.learnprogramming;

public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(9);
        printYearsAndDays(-1);
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / 1440;
            long years = days / 365;
            long remainingDays = days % 365;
            String displayMinutes = minutes + " min";
            String displayDays = remainingDays + " d";
            String displayYears = years + " y";

            // If you want leading Zeros (uncomment below)

//            if (years < 10) {
//                displayYears = "0" + displayYears;
//            }
//            if (days < 10) {
//                displayDays = "0" + displayDays;
//            }
//            if (minutes < 10) {
//                displayMinutes = "0" + displayMinutes;
//            }

            System.out.println(displayMinutes + " = " + displayYears + " and " + displayDays);
        }
    }
}
