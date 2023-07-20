import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        /*
         * Homework
         * Write a program that calculates the area of the triangle whose three side
         * lengths you get from the user.
         * 
         * Formula
         * perimeter of triangle = 2𝑢
         * 
         * 𝑢 = (a+b+c) / 2
         * 
         * Area * Area = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */

        double a, b, c, u, area;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        a = input.nextInt();

        System.out.print("Enter second side: ");
        b = input.nextInt();

        System.out.print("Enter third side: ");
        c = input.nextInt();

        u = (a + b + c) / 2; // 2u = perimeter, u = perimeter/2
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println(area);

    }

}
