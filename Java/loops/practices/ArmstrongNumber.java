import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        /*
         * We write a program that finds whether a number is an armstrong number with
         * Java loops.
         * 
         * What is Armstrong Number?
         * An n-digit number is called an Armstrong number if the sum of the nth powers
         * of the digits is equal to the number itself.
         * 
         * For example, let's take the number 407. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407.
         * This shows that the number 407 is an armstrong number.
         * 
         * Let's also look at the number 1342. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354
         * is not an armstrong number because it is not equal to 1342.
         * 
         * 1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
         * 
         * 54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }
    }
}
