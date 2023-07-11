import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        /*
         * We will write a program that finds the harmonic series of the number entered
         * in Java.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = input.nextInt();
        double result = 0.0;

        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println("Sum of Harmonic Series is " + result);
    }
}
