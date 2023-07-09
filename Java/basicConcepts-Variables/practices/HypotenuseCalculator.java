import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        /*
         * Program to Find Hypotenuse in Right Triangle
         * Write a program in Java that takes the length of the perpendicular sides from
         * the user and calculates the hypotenuse.
         * 
         */

        int a, b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.print("length of the one of the perpendicular sides: ");
        a = input.nextInt();

        System.out.print("length of the other of the perpendicular sides: ");
        b = input.nextInt();

        c = Math.sqrt(a * a + b * b);
        System.out.println("hypotenuse length is " + c);
    }
}
