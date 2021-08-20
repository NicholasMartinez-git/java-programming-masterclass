/* Section 5 : Coding Exercise 20: Greatest Common Divisor */

package masterclass.learnprogramming;

import java.util.ArrayList;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(10, 10));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        ArrayList<Integer> listOfDivisors1 = new ArrayList<>();
        ArrayList<Integer> listOfDivisors2 = new ArrayList<>();

        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                listOfDivisors1.add(i);
            }
        }

        for (int j = 1; j <= second; j++) {
            if (second % j == 0) {
                listOfDivisors2.add(j);
            }
        }

        for (int k = listOfDivisors1.size(); k-- > 0; ) {
            for (int h = listOfDivisors2.size(); h-- > 0; ) {
                if (listOfDivisors1.get(k).equals(listOfDivisors2.get(h))) {
                    return listOfDivisors1.get(k);
                }
            }
        }

        return -1;
    }
}
