/* Section 5 : Coding Exercise 27: Input Calculator */

package masterclass.learnprogramming;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        double avg = 0;
        boolean keepGoing = true;
        while (keepGoing) {
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                avg = (double) sum / counter;
            } else {
                keepGoing = false;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        scanner.close();
    }
}
