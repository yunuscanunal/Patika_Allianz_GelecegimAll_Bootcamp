import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int timesOfLoop = input.nextInt();
        int i = 0, minNumber = 0, maxNumber = 0;

        while (i < timesOfLoop) {
            System.out.print("Enter the " + (i + 1) + "'s Number: ");
            int element = input.nextInt();
            if (element < minNumber) {
                minNumber = element;
            }
            if (element > maxNumber) {
                maxNumber = element;
            }
            i++;
        }

        System.out.println("Minimum Sayı " + minNumber);
        System.out.println("Maximum Sayı " + maxNumber);

    }
}
