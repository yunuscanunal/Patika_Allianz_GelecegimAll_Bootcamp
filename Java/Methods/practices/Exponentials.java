package Java.Methods.practices;

import java.util.Scanner;

public class Exponentials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number : ");
        double number = input.nextDouble();
        System.out.print("Input the power : ");
        double power = input.nextDouble();
        System.out.println(power(number, power));
    }

    public static double power(double number, double power) {
        if (power == 0) {
            return 1;
        } else if (power < 0) {
            double numerator = number * Math.abs(power(number, Math.abs(power) - 1));
            return 1 / numerator;
        }
        return number * power(number, power - 1);
    }
}
