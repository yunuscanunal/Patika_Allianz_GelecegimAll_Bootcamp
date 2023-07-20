import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args) {
        /*
         * Taximeter Program
         * Write a program that prints the taximeter amount on the screen according to
         * the distance traveled (KM) with Java.
         * 
         * Taximeter costs 2.20 TL per km.
         * The minimum amount to be paid is 20 TL. 20 TL will be charged for the fees
         * below 20 TL.
         * Taximeter opening fee is 10 TL.
         */

        int km, openingFee = 10, minAmount = 20;
        double taximeter = 2.2, fee;

        Scanner input = new Scanner(System.in);
        System.out.print("The Distance of Traveled (KM): ");
        km = input.nextInt();

        fee = km * taximeter + openingFee;
        double standartFee = fee <= 20 ? 20 : fee;
        System.out.println("Total Fee: " + standartFee + " ₺");

    }
}
