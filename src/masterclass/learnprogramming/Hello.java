package masterclass.learnprogramming;

public class Hello {

    public static void main(String[] args) {
        // Challenge #1
        System.out.println("Hello World");

        /* Challenge #2
        Java follows the order of operations called PEMDAS
        Therefore the equation breaks down as such:
        myFirstNumber = (10 + 5) - (2 * 10) / 3;
                      = 15 - 20 / 3
                      = 15 - 6.666
        The variable (int) can only store whole numbers so any (int) through the breakdown process
        that normally would get decimals is rounded down before continuing the order of operations.
        Therefore, 6.666 is converted to 6 leading to:
                      = 15 - 6
                      = 9
         */
        int myFirstNumber = (10 + 5) - (2 * 10) / 3; // = 9

        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
