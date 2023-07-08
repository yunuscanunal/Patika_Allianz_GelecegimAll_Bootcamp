import java.util.Scanner;

public class GradeAverage {
    /*
     * Grade Point Average Calculator
     *
     * Write a program that takes the exam scores of Mathematics, Physics,
     * Chemistry, Turkish, History, Music courses from the user and calculates the
     * averages and prints them on the screen with Java.
     *
     * Homework
     * In the same program, using conditional expressions, if the user's average is
     * greater than 60, the screen should write "Passed the Class" and if it is
     * less, "Failed in the Class".
     *
     * Note: If and Else will not be used...
     */

    public static void main(String[] args) {
        // creating variables
        int mathGrade, physGrade, chemGrade, turkGrade, histGrade, musicGrade;

        // scanner part
        Scanner input = new Scanner(System.in);

        // take grades
        System.out.print("Matematik Notunuzu Giriniz: ");
        mathGrade = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        physGrade = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        chemGrade = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkGrade = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        histGrade = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        musicGrade = input.nextInt();

        // System.out.format("%d %d %d %d %d %d", mathGrade, physGrade, chemGrade,
        // turkGrade, histGrade, musicGrade);

        int total = (mathGrade + physGrade + chemGrade + turkGrade + histGrade + musicGrade);
        double avg = total / 6;
        System.out.println("Ortalamanız: " + avg);

        String str = avg >= 60 ? "Geçti" : "Kaldı";
        System.out.println(str);
    }

}
