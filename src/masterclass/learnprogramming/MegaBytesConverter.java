/* Section 4 : Coding Exercise 2: MegaBytes Converter */

package masterclass.learnprogramming;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // 1 MB = 1024 KB
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes % 1024;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}
