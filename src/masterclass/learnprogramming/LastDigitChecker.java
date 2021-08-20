/* Section 5 : Coding Exercise 19: LastDigitChecker */

package masterclass.learnprogramming;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(hasSameLastDigit(17, 99, 77));
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) & isValid(num3)) {
            String numberString1 = String.valueOf(num1);
            String numberString2 = String.valueOf(num2);
            String numberString3 = String.valueOf(num3);
            String[] numberStringArray1 = numberString1.split("");
            String[] numberStringArray2 = numberString2.split("");
            String[] numberStringArray3 = numberString3.split("");
            int lastDigitNum1 = Integer.parseInt(numberStringArray1[numberStringArray1.length - 1]);
            int lastDigitNum2 = Integer.parseInt(numberStringArray2[numberStringArray2.length - 1]);
            int lastDigitNum3 = Integer.parseInt(numberStringArray3[numberStringArray3.length - 1]);
            return lastDigitNum1 == lastDigitNum2 || lastDigitNum1 == lastDigitNum3 || lastDigitNum2 == lastDigitNum3;
        } else {
            return false;
        }
    }
}
