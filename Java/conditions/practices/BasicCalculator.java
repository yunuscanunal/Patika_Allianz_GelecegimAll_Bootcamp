import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        /*
         * Homework
         * Make the calculator using switch-case.
         */
        int numberOne, numberTwo, operationNumber;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first Number: ");
        numberOne = input.nextInt();

        System.out.print("Enter the second Number: ");
        numberTwo = input.nextInt();

        System.out.println("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division");
        System.out.print("Enter the operation number: ");

        operationNumber = input.nextInt();

        switch (operationNumber) {
            case 1:
                System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
                break;
            case 2:
                System.out.println(numberOne + " - " + numberTwo + " = " + (numberOne - numberTwo));
                break;
            case 3:
                System.out.println(numberOne + " * " + numberTwo + " = " + (numberOne * numberTwo));
                break;
            case 4:
                System.out.println(numberOne + " / " + numberTwo + " = " + (numberOne / numberTwo));
                break;
            default:
                System.out.println("Try Again");
        }

    }
}
