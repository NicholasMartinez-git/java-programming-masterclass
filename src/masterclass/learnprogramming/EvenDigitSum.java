/* Section 5 : Coding Exercise 17: Even Digit Sum */

package masterclass.learnprogramming;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sumOfEvenDigit = 0;
        String numberString = String.valueOf(number);
        String[] splitNumberString = numberString.split("");
        for (int i = 0; i < splitNumberString.length; i++) {
            int splitNumber = Integer.parseInt(splitNumberString[i]);
            if (splitNumber % 2 == 0) {
                sumOfEvenDigit += splitNumber;
            }
        }
        return sumOfEvenDigit;
    }
}
