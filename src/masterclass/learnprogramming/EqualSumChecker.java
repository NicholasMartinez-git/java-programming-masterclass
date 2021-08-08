/* Section 4 : Coding Exercise 6: Equal Sum Checker */

package masterclass.learnprogramming;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int num1, int num2, int sum) {
        return num1 + num2 == sum;
    }
}
