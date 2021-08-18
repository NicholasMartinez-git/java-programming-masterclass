/* Section 5 : Coding Exercise 15: Number Palindrome */

package masterclass.learnprogramming;

import java.util.*;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(112112));
    }

    public static boolean isPalindrome(int number) {
        int absoluteNumber = Math.abs(number);
        String numberString = String.valueOf(absoluteNumber);
        String[] numberStringArray = numberString.split("");
        Collections.reverse(Arrays.asList(numberStringArray));
        int reversedNumber = Integer.parseInt(String.join("", numberStringArray));
        return absoluteNumber == reversedNumber;
    }
}
