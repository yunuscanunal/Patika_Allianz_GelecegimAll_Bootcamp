import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = input.nextInt();

        if ((year % 400 != 0)) {
            if ((year % 100 != 0)) {
                if (year % 4 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else
                    System.out.println(year + " is not a Leap Year");
            } else
                System.out.println(year + " is not a Leap Year");
        } else
            System.out.println(year + " is a Leap Year");
    }

}
