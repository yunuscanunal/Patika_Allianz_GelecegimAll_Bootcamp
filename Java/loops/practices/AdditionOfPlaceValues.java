import java.util.Scanner;

public class AdditionOfPlaceValues {
    public static void main(String[] args) {
        /*
         * Write a program that calculates the sum of the digits of a number.
         * 
         * Example: 1643 = 1 + 6 + 4 + 3 = 14
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int remainder = 1, sum = 0;
        while (number != 0) {
            remainder = number % 10;
            number /= 10;
            sum += remainder;
        }
        System.out.println("Summ = " + sum);
    }
}
