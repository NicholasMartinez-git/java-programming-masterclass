package masterclass.learnprogramming;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(15, 33));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        int count = 0;
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
            String numberString1 = String.valueOf(num1);
            String numberString2 = String.valueOf(num2);
            String[] splitNumberString1 = numberString1.split("");
            String[] splitNumberString2 = numberString2.split("");
            for (int i = 0; i < splitNumberString1.length; i++) {
                for (int j = 0; j < splitNumberString2.length; j++) {
                    int number1 = Integer.parseInt(splitNumberString1[i]);
                    int number2 = Integer.parseInt(splitNumberString2[j]);
                    if (number1 == number2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
