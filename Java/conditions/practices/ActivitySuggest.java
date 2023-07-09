import java.util.Scanner;

public class ActivitySuggest {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık giriniz:");
        heat = input.nextInt();

        if (heat > 25) {
            System.out.println("You should go to swim");
        } else if (heat > 15) {
            System.out.println("You should go to picnic");
        } else if (heat > 5) {
            System.out.println("You should go to cafe for drinking coffee");
        } else {
            System.out.println("You should go to ski!");
        }
    }
}
