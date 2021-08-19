package masterclass.learnprogramming;

public class SharedDigit {
    public static void main(String[] args) {

    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
            String numberString1 = String.valueOf(num1);
            String numberString2 = String.valueOf(num2);
            String[] splitNumberString1 = numberString1.split("");
            String[] splitNumberString2 = numberString2.split("");
        } else {
            return false;
        }
    }
}
