import java.util.Scanner;

public class BodyMassCalculator {
    public static void main(String[] args) {
        /*
         * Body Mass Index Calculator
         * With Java, take the height and weight values from the user and assign them to
         * a variable. Calculate the user's "Body Mass Index" according to the formula
         * below and print it on the screen.
         * 
         * Formula
         * Weight (kg) / Height (m) * Height (m)
         * 
         * output
         * Please enter your height (in meters): 1.72
         * Please enter your weight : 105
         * Your Body Mass Index: 35.49215792320173
         */

        int weight;
        double heigth;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Heigth (Meter): ");
        heigth = input.nextDouble();

        System.out.print("Enter the Weight (Kilogram): ");
        weight = input.nextInt();

        double BMI = weight / (heigth * heigth);

        System.out.println("Your Body Mass Index: " + BMI);
    }
}
