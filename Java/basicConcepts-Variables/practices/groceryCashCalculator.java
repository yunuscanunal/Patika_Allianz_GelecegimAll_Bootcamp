import java.util.Scanner;

public class GroceryCashCalculator {
    public static void main(String[] args) {
        /*
         * Grocery Cashier Program
         * Write a program in Java that prints the total amount of the products
         * purchased from the grocery store, according to the kilogram values, to the
         * screen.
         * 
         * Fruits and KG Prices
         * 
         * Pear: 2.14 TL
         * Apple : 3.67 TL
         * Tomatoes: 1.11 TL
         * Banana: 0.95 TL
         * Eggplant : 5.00 TL
         * Sample Output;
         */
        double pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, eggplant = 5.00, total;
        double kgPear, kgApple, kgTomato, kgBanana, kgEgg;

        Scanner input = new Scanner(System.in);
        System.out.print("Kg of Pear: ");
        kgPear = input.nextDouble();

        System.out.print("Kg of Apple: ");
        kgApple = input.nextDouble();

        System.out.print("Kg of Tomatoes: ");
        kgTomato = input.nextDouble();

        System.out.print("Kg of Banana: ");
        kgBanana = input.nextDouble();

        System.out.print("Kg of Eggplant: ");
        kgEgg = input.nextDouble();

        total = (pear * kgPear) + (apple * kgApple) + (tomatoes * kgTomato) + (banana * kgBanana) + (eggplant * kgEgg);

        System.out.println("Total Amount is: " + total + " TL");

    }

}
