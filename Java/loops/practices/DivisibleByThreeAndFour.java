import java.util.Scanner;

public class DivisibleByThreeAndFour {
    public static void main(String[] args) {
        /*
         * Write a program that calculates the average of numbers divisible by 3 and 4
         * from 0 to the number entered with Java loops.
         */

        int k;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++) {
            if (i % 12 == 0) { // divisible by 3 and 4 means divisible by 12.
                System.out.println(i);
            }
        }
    }

}
