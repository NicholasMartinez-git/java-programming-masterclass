package masterclass.learnprogramming;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(5);
        printSquareStar(2);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // Controls the Rows
            for (int row = 0; row < number; row++) {

                // Controls the Columns
                for (int column = 0; column < number; column++) {
                    if (row == 0 || row == (number - 1)) {
                        System.out.print("*");
                    } else if (column == 0 || column == (number -1)) {
                        System.out.print("*");
                    } else if (row == column) {
                        System.out.print("*");
                    } else if (column == number - row - 1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    }
}
