
/* Part 1:
 Section 3 : Video 28 */

/* Part 2:
 Section 3 : Video 30 */

package masterclass.learnprogramming;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {
        // Part 1:
        byte myByte = 20;
        short myShort = 3006;
        int myInt = 12050;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);

        // Part 2:
        double pounds = 59d;
        double kilograms = 0.45359237d;
        double convertedKilograms = pounds * kilograms;
        System.out.println("Converted kilograms = " + convertedKilograms);
    }
}
