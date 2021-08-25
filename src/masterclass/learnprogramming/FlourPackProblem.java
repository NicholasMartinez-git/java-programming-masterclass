/* Section 5 : Coding Exercise 24: Flour Pack Problem */

package masterclass.learnprogramming;

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
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // goal = total kilos
        // bigFlourBag = 5 kilos per
        // smallFlourBag = 1 kilo per

        int bigFlourBagsWeight = bigCount * 5;
        int totalFlourBagsWeight = bigFlourBagsWeight + smallCount;
        int remainingFlourBagsWeight = 0;
        boolean usedAllBigFlourBagsFirst = false;
        boolean canPack = false;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (totalFlourBagsWeight > goal && bigCount > 0) {
            remainingFlourBagsWeight = goal - bigFlourBagsWeight;
            usedAllBigFlourBagsFirst = remainingFlourBagsWeight >= 0;
        }
        
        if (usedAllBigFlourBagsFirst)

        return canPack;
    }
}
