import java.util.Scanner;

public class TaxCalculator {
    /*
     * VAT Amount Calculator Program
     * Write a program that calculates the VAT value and the VAT amount of the money
     * value received from the user with Java and prints it on the screen.
     * 
     * (Note: Take the VAT amount as 18%)
     * 
     * Price without VAT = 10;
     * 
     * Price with VAT = 11.8;
     * 
     * VAT amount = 1.8;
     * 
     * Homework
     * If the amount entered is between 0 and 1000 TL, the VAT rate is 18%, if the
     * amount is greater than 1000 TL, write the program that calculates the VAT
     * amount as 8%.
     */
    public static void main(String[] args) {
        double amount, taxAmount, totalAmount;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fee Amount: ");
        amount = input.nextDouble();

        double taxRate = amount >= 1000 ? 0.08 : 0.18;
        // System.out.println(taxRate);

        taxAmount = amount * taxRate;
        totalAmount = amount + taxAmount;

        System.out.println("Amount Without Taxes: " + amount);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Amount With Taxes: " + totalAmount);
    }
}
