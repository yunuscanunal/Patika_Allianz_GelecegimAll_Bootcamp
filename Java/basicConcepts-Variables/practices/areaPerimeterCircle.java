import java.util.Scanner;

public class AreaPerimeterCircle {
    public static void main(String[] args) {
        /*
         * Program to Calculate Area and Perimeter of a Circle
         * Write a program in Java that calculates the area and perimeter of a circle
         * whose radius you get from the user.
         * 
         * Area Formula: π * r * r;
         * 
         * Perimeter Formula: 2 * π * r;
         */
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        r = input.nextInt();

        double perimeter = 2 * pi * r;
        double area = pi * r * r;

        System.out.println("Area of the Circle: " + area + "\nPerimeter of the Circle: " + perimeter);
    }
}
