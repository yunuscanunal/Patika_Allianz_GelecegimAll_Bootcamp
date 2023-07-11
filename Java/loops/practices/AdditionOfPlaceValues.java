import java.util.Scanner;

public class AdditionOfPlaceValues {
    public static void main(String[] args) {

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
