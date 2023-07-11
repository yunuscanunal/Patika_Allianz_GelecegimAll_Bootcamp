import java.util.Scanner;

public class PowersOfFourAndFive {
    public static void main(String[] args) {
        /*
         * We write a program that prints powers of 4 and 5 up to the number entered
         * with Java loops.
         */

        int k;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Limit Number: ");
        k = input.nextInt();
        System.out.println("Powers of Four are: ");
        for (int i = 1; i <= k; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of Five are: ");
        for (int i = 1; i <= k; i *= 5) {
            System.out.println(i);
        }
    }
}
