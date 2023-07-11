package Java.loops.practices;

import java.util.Scanner;

public class ReverseTrianglePattern {
    public static void main(String[] args) {
        // ***********
        // *********
        // *******
        // *****
        // ***
        // *
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
