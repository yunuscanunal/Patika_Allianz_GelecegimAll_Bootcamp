import java.util.Scanner;

public class SortingProgram {
    public static void main(String[] args) {
        /*
         * Write a program that sorts the 3 entered numbers "from least to greatest".
         */
        int a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.print("a:");
        a = input.nextInt();

        System.out.print("b:");
        b = input.nextInt();

        System.out.print("c:");
        c = input.nextInt();

        if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println(c + " < " + b + " < " + a + "\nc < b < a");
            } else {
                System.out.println(b + " < " + c + " < " + a + "\nc < b < a");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.println(c + " < " + a + " < " + b + "\nc < a < b");
            } else {
                System.out.println(a + " < " + c + " < " + b + "\na < c < b");
            }
        } else {
            if (b > a) {
                System.out.println(a + " < " + b + " < " + c + "\na < b < c");
            } else {
                System.out.println(b + " < " + a + " < " + c + "\nb < a < c");
            }
        }
    }

}
