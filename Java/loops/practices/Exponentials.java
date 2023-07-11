import java.util.Scanner;

public class Exponentials {
    public static void main(String[] args) {
        /*
         * Use the "For Loop" program that calculates exponential numbers with the
         * values entered by the user in Java.
         */

        int base, exponent, total = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        base = input.nextInt();

        System.out.print("Enter the exponent number: ");
        exponent = input.nextInt();

        for (int i = 1; i <= Math.abs(exponent); i++) {
            total *= base;
        }

        if (exponent == 0) {
            total = 1;
            System.out.println(total);
        } else if (exponent < 0) {
            System.out.println(1 + "/" + total);
        } else {
            System.out.println(total);
        }
    }
}