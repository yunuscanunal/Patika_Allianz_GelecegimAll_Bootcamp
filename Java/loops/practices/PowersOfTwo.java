import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        /*
         * We write a program that prints powers of 2 up to the number entered with Java
         * loops.
         */

        int k;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Limit Number: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i *= 2) {
            System.out.println(i);
        }
    }
}
