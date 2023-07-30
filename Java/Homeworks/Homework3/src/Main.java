import main.CourseGrade;
import main.GenerateTranscript;
import main.Transcript;
import util.Grade;
import util.GradeTest;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        GenerateTranscript generateTranscript = new GenerateTranscript();
        GradeTest gradeValue = new GradeTest();
        gradeValue.value();

        CourseGrade course1 = new CourseGrade("CENG", 201, 4, Grade.D);
        CourseGrade course2 = new CourseGrade("MATH", 601, 4, Grade.A); // Varsayılan courseCode atanır.
        CourseGrade course3 = new CourseGrade("ME", 201, 5, Grade.C);
        CourseGrade course4 = new CourseGrade("ECE", 201, 3, Grade.F);
        CourseGrade course5 = new CourseGrade("CENG", 101, 4, Grade.B);

        Transcript transcript = new Transcript(1112234);
        transcript.addTakenCourse(course1);
        transcript.addTakenCourse(course2);
        transcript.addTakenCourse(course3);
        transcript.addTakenCourse(course4);
        transcript.addTakenCourse(course5);

        System.out.print(transcript);
        generateTranscript.takeInputFromFile();
    }
}