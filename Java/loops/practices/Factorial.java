import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /*
         * We are writing a program that calculates factorial in Java.
         */

        int k, total = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= i;
        }
        System.out.println(k + "! = " + total);
    }
}
