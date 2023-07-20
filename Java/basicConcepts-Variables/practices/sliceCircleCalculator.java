import java.util.Scanner;

public class SliceCircleCalculator {
    public static void main(String[] args) {
        /*
         * Homework
         * Write a program that finds the area of a slice of circle with radius r and
         * measure 𝛼 of the central angle.
         * 
         * Take 𝜋 = 3.14.
         * 
         * Formula : (𝜋 * (r*r) * 𝛼) / 360
         */

        double pi = 3.14;
        int r, centralAngle;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        r = input.nextInt();

        System.out.print("Enter the Central Angle: ");
        centralAngle = input.nextInt();

        double areaSlice = pi * r * r * centralAngle / 360;
        System.out.println(areaSlice);

    }
}
