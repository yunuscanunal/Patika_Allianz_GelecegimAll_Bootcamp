import java.util.Scanner;
public class primeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Asal sayı kontrolü için bir sayı giriniz : ");
        int number = input.nextInt();
        recursivePrime(number);
    }
    public static void recursivePrime(int number) {
        if (number < 2) {
            System.out.println("Geçerli bir sayı girmediniz.");
            return;
        }
        if (recursivePrimeSecond(number, number-1) == 0) {
            System.out.println(number + " bir asal sayı değildir.");
        } else {
            System.out.println(number + " bir asal sayıdır.");
        }
    }
    public static int recursivePrimeSecond(int number, int check) {
        if (check == 1) {
            return 1;
        } else if (number%check == 0) {
            return 0;
        } else {
            return recursivePrimeSecond(number, check-1);
        }
    }
}