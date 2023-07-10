import java.util.Scanner;

public class FindAdditionOfOdd {
    public static void main(String[] args) {
        /*
         * With Java loops, we write a program that accepts input from the user until a
         * negative value is entered and collects the odd numbers from the entered
         * values and prints it on the screen.
         */

        int k, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter Number (Enter Negative Number For EXIT): ");
            k = input.nextInt();

            if (k % 2 == 1) {
                total += k;
            }
        } while (k >= 0);

        System.out.println("Total Sum = " + total);
    }
}
