/* Section 5 : Video 70 */

package masterclass.learnprogramming;

import java.util.Arrays;

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(10));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1259));
        System.out.println(sumDigits(12597));
    }

    public static int sumDigits(int number) {
        int sumOfAllDigits = 0;
        String numberString = String.valueOf(number);
        String[] splitNumberString = numberString.split("");
        if (number >= 10) {
            for (int i = 0; i < splitNumberString.length; i++) {
                int splitNumber = Integer.parseInt(splitNumberString[i]);
                sumOfAllDigits += splitNumber;
            }
            return sumOfAllDigits;
        } else {
            return -1;
        }
    }
}
