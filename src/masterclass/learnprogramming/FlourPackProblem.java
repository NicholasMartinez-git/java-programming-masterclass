/* Section 5 : Coding Exercise 24: Flour Pack Problem */

package masterclass.learnprogramming;

import java.util.spi.CalendarNameProvider;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(2, 0, 9));
        System.out.println(canPack(1, 5, 9));

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));

        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(4, 18, 19));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // goal = total kilos
        // bigFlourBag = 5 kilos per
        // smallFlourBag = 1 kilo per

        int totalFlourBagsWeight = (5 * bigCount) + smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        return ((totalFlourBagsWeight >= goal) && (goal % 5 <= smallCount));
    }
}
