/* Section 5 : Coding Exercise 23: Number To Words */

package masterclass.learnprogramming;

import java.util.Arrays;
import java.util.Collections;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(-121));
        System.out.println(reverse(-1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println(reverse(-2356));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
    }

    /* The numberToWords() doesn't need the getDigitCount() or reverse() to print numbers to words,
    but if you didn't know how to use arrays then you would have to use the other functions to get the proper display. */

    public static void numberToWords(int number)  {
//        if (number < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            String numberString = String.valueOf(number);
//            String[] splitNumberStringArray = numberString.split("");
//            for (int i = 0; i < splitNumberStringArray.length; i++) {
//                int splitNumber = Integer.parseInt(splitNumberStringArray[i]);
//                if (splitNumber == 0) {
//                    System.out.println("Zero");
//                } else if (splitNumber == 1) {
//                    System.out.println("One");
//                } else if (splitNumber == 2) {
//                    System.out.println("Two");
//                } else if (splitNumber == 3) {
//                    System.out.println("Three");
//                } else if (splitNumber == 4) {
//                    System.out.println("Four");
//                } else if (splitNumber == 5) {
//                    System.out.println("Five");
//                } else if (splitNumber == 6) {
//                    System.out.println("Six");
//                } else if (splitNumber == 7) {
//                    System.out.println("Seven");
//                } else if (splitNumber == 8) {
//                    System.out.println("Eight");
//                } else if (splitNumber == 9) {
//                    System.out.println("Nine");
//                }
//            }
//        }

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int reversedNumber = reverse(number);
            int limit = (getDigitCount(number) - getDigitCount(reversedNumber));
            while (reversedNumber != 0) {
                int remainder = reversedNumber % 10;
                reversedNumber = reversedNumber / 10;
                if (remainder == 0) {
                    System.out.println("Zero");
                } else if (remainder == 1) {
                    System.out.println("One");
                } else if (remainder == 2) {
                    System.out.println("Two");
                } else if (remainder == 3) {
                    System.out.println("Three");
                } else if (remainder == 4) {
                    System.out.println("Four");
                } else if (remainder == 5) {
                    System.out.println("Five");
                } else if (remainder == 6) {
                    System.out.println("Six");
                } else if (remainder == 7) {
                    System.out.println("Seven");
                } else if (remainder == 8) {
                    System.out.println("Eight");
                } else if (remainder == 9) {
                    System.out.println("Nine");
                }
            }
            for (int i = 0; i < limit; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number >= 0) {
            String numberString = String.valueOf(number);
            String[] splitNumberStringArray = numberString.split("");
            return splitNumberStringArray.length;
        } else {
            return -1;
        }

    }

    public static int reverse(int number) {
        int absoluteNumber = Math.abs(number);
        String numberString = String.valueOf(absoluteNumber);
        String[] numberStringArray = numberString.split("");
        Collections.reverse(Arrays.asList(numberStringArray));
        int reversedNumber = Integer.parseInt(String.join("", numberStringArray));
        if (number < 0) {
            return reversedNumber * -1;
        }


        // alternative solution for reversing a number.

//        int reversedNumber = 0;
//        while (number != 0) {
//            int remainder = number % 10;
//            reversedNumber = reversedNumber * 10 + remainder;
//            number = number / 10;
//        }

        return reversedNumber;
    }
}
