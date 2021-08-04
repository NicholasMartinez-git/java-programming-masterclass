/* Section 3 : Video 40 */

package masterclass.learnprogramming;

public class OperatorPrecedenceAndOperatorChallenge {
    public static void main(String[] args) {
        double x = 20.00d;
        double y = 80.00d;
        double z = (x + y) * 100.00d;
        System.out.println("z = " + z);
        double remainder = z % 40.00d;
        System.out.println("Remainder = " + remainder);
        boolean isNoRemainder = remainder == 0; // Simplification of (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
