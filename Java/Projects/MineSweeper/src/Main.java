import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int row, column;

        System.out.println("Mayın Tarlasına Hoşgeldiniz !!!");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz: ");
        System.out.print("Satır sayısı: ");
        row = sc.nextInt();
        System.out.print("Sütun sayısı: ");
        column = sc.nextInt();

        MineSweeper mine = new MineSweeper(row, column);
        mine.run();
    }
}