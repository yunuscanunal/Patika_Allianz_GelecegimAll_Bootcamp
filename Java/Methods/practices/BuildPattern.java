package Java.Methods.practices;

import java.util.Scanner;

public class BuildPattern {

    static void recursive(int number) {
        System.out.print(number + " ");
        if (number > 0) {
            recursive(number - 5);
        }
        System.out.print(number + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = input.nextInt();

        recursive(n);
        System.out.println();
    }
}