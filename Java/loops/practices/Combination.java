import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        /*
         * The number of different groups with r elements to be formed with the elements
         * of a set with n elements is called the r combination of n. The r combination
         * of N is denoted as C(n,r).
         * 
         * Write a program that calculates combinations in Java.
         * 
         * Combination formula
         * C(n,r) = n! / (r! * (n-r)!)
         */

        int n, r, result;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n value: ");
        n = input.nextInt();
        System.out.print("Enter r value: ");
        r = input.nextInt();

        // C(n,r) = n! / (r! * (n-r)!)

        int combination = factorialise(n) / (factorialise(r) * factorialise((n - r)));
        System.out.println("Combination(" + n + ", " + r + ") = " + combination);
        ;
    }

    public static int factorialise(int num) {

        int total = 1;
        for (int i = 2; i <= num; i++) {
            total *= i;
        }
        return total;
    }

}
