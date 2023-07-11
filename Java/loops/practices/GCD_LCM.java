import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        /*
         * We are writing a program that finds the GCD and LCC values of two numbers in
         * Java.
         * 
         * GCD: The greatest common divisor of two or more natural numbers is called the
         * greatest common divisor of these numbers, in short GCD.
         * 
         * LCM: The smallest of the common multiples of two or more natural numbers is
         * called the least common multiple of these numbers, in short LCM.
         */
        int numberOne, numberTwo, i = 1, gcd = 1, lcm = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the smaller number: ");
        numberOne = input.nextInt();
        System.out.print("Enter the larger number: ");
        numberTwo = input.nextInt();

        while (i <= numberOne) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                gcd = i;
            }
            i++;
        }
        System.out.println("greatest common divisor: " + gcd);

        while (i <= numberOne * numberTwo) {
            if (i % numberOne == 0 && i % numberTwo == 0) {
                lcm = i;
                break;
            }
            i++;
        }
        System.out.println("least common multiple: " + lcm);
    }
}