/* Section 5 : Coding Exercise 12: Number In Word */

package masterclass.learnprogramming;

public class NumberInWord {

    public static void main(String[] args) {
        printNumberInWord(-1);
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);
    }

    public static void printNumberInWord (int num) {
        if (num == 0) {
            System.out.println("ZERO");
        } else if (num == 1) {
            System.out.println("ONE");
        } else if (num == 2) {
            System.out.println("TWO");
        } else if (num == 3) {
            System.out.println("THREE");
        } else if (num == 4) {
            System.out.println("FOUR");
        } else if (num == 5) {
            System.out.println("FIVE");
        } else if (num == 6) {
            System.out.println("SIX");
        } else if (num == 7) {
            System.out.println("SEVEN");
        } else if (num == 8) {
            System.out.println("EIGHT");
        } else if (num == 9) {
            System.out.println("NINE");
        } else {
            System.out.println("OTHER");
        }
    }
}
