import java.util.Scanner;

public class PassingGradeChecking {
    public static void main(String[] args) {
        /*
         * Courses: Mathematics, Physics, Turkish, Chemistry, Music
         * 
         * Passing Grade : 55
         * 
         * Homework
         * If the course grades entered are not between 0 or 100, they should not be
         * included in the average.
         * 
         */
        // creating variables
        int mathGrade, physGrade, turkGrade, chemGrade, musicGrade, totalGrade = 0, totalLecture = 0;

        // scanner part
        Scanner input = new Scanner(System.in);

        // take grades
        System.out.print("Enter Math Grade: ");
        mathGrade = input.nextInt();
        if (mathGrade >= 0 && mathGrade <= 100) {
            totalGrade += mathGrade;
            totalLecture++;
        }

        System.out.print("Enter Physics Grade: ");
        physGrade = input.nextInt();
        if (physGrade >= 0 && physGrade <= 100) {
            totalGrade += physGrade;
            totalLecture++;
        }

        System.out.print("Enter Turhish Grade: ");
        turkGrade = input.nextInt();
        if (turkGrade >= 0 && turkGrade <= 100) {
            totalGrade += turkGrade;
            totalLecture++;
        }

        System.out.print("Enter Chemistry Grade: ");
        chemGrade = input.nextInt();
        if (chemGrade >= 0 && chemGrade <= 100) {
            totalGrade += chemGrade;
            totalLecture++;
        }

        System.out.print("Enter Music Grade: ");
        musicGrade = input.nextInt();
        if (musicGrade >= 0 && musicGrade <= 100) {
            totalGrade += musicGrade;
            totalLecture++;
        }

        double avg = totalGrade / totalLecture;
        System.out.println("Your Average: " + avg);

        if (avg > 55) {
            System.out.println("Congrats, Passed the Class!");
        } else {
            System.out.println("You Failed!");
        }
    }

}
