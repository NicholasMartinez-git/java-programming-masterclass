package masterclass.learnprogramming;

public class PrimitiveTypesChallenge {

    public static void main(String[] args) {
        byte myByte = 20;
        short myShort = 3006;
        int myInt = 12050;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);
    }
}
