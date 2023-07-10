import java.util.Scanner;

public class AdditionOfMultipleOf4 {
    public static void main(String[] args) {
        /*
         * Homework
         * With Java loops, we write a program that accepts input from the user until a
         * single number is entered and adds even and multiples of 4 from the entered
         * values and prints it on the screen.
         */

        int k, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter Number(Enter ODD Number For EXIT): ");
            k = input.nextInt();

            if ((k % 4 == 0)) { // if number is multiples of 4 then that number is also even.
                total += k;
                System.out.println("Total Sum = " + total);
            }
        } while (k % 2 == 0);
        System.out.println("Total Sum = " + total);
    }
}
