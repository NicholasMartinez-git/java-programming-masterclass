package masterclass.learnprogramming;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-1));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int sumOfFirstAndLastDigit = 0;
        String numberString = String.valueOf(number);
        String[] splitNumberString = numberString.split("");
        for (int i = 0; i < splitNumberString.length; i++) {
            int firstDigit = Integer.parseInt(splitNumberString[0]);
            int lastDigit = Integer.parseInt(splitNumberString[splitNumberString.length - 1]);
            sumOfFirstAndLastDigit = firstDigit + lastDigit;
        }
        return sumOfFirstAndLastDigit;
    }
}
