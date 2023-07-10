import java.util.Scanner;

public class EvenNumberFinder {
    /*
     * We write a program that finds even numbers up to the number entered by the
     * user with Java loops.
     */
    public static void main(String[] args) {
        int k;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}