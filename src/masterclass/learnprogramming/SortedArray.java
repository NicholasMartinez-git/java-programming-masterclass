/* Section 7 : Coding Exercise 41: Sorted Array */

package masterclass.learnprogramming;

import java.util.Scanner;

public class SortedArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter how many integers you wish to sort?\r");
        int userArrayLength = scanner.nextInt();
        int[] userIntegers = getIntegers(userArrayLength);
        printArray(sortIntegers(userIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Please enter " + number + " integer values.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int[] sortIntegers(int[] array) {
        String sortConfirmation;

        System.out.println("The program sorts the integers in ascending order by default.");
        System.out.println("Would you like the integers to be in descending order? [y/n]");
        sortConfirmation = scanner.next();
        System.out.println("Sorting integers...");
        int temp;
        // sorts and reverses the array
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                // the greater than or less than symbol determines whether the array will be ascending or descending
                if (sortConfirmation.equalsIgnoreCase("y")) {
                    if (array[i] < array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        return array;
    }

    public static void printArray(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("Element " + i + " contents " + sortedArray[i]);
        }
    }

}
