/* Section 8 : Coding Exercise 42: Minimum Element */

package masterclass.learnprogramming;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {

    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int element) {
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[element];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    private static int findMin(int[] array) {
        int temp;
        // sorts array in ascending number
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array[0];
    }
}
