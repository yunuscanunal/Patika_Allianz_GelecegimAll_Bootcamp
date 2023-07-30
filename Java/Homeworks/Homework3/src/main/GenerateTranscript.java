package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenerateTranscript {
    Scanner input = new Scanner(System.in);
    public void takeInputFromUser() {



        System.out.println(("Enter Student Id: "));
        int studentId = input.nextInt();
        Transcript transcript = new Transcript(studentId);

        System.out.println(("Enter Department: "));
        String courseDepartment = input.nextLine();
        CourseGrade courseGrade = new CourseGrade(courseDepartment);
        courseGrade.setCourseDepartment(courseDepartment);

        System.out.println(("Enter Course Code: "));
        int courseCode = input.nextInt();
        courseGrade.setCourseCode(courseCode);
        System.out.println(("Enter Course Credit: "));
        int courseCredit = input.nextInt();
        courseGrade.setCourseCredit(courseCredit);
        System.out.println(("Enter Grade(Numeric value): "));
        double gradeTaken = input.nextDouble();
        courseGrade.setGradeTaken(gradeTaken);

        transcript.addTakenCourse(courseGrade);
    }

    public void takeInputFromFile() {

        System.out.print("Enter filename: ");
        String filePath = "/Users/yunuscanunal/Desktop/Eğitimler/Patika.dev/Patika_Allianz_GelecegimAll_Bootcamp/Java/Homeworks/Homework3/"
                + input.nextLine().trim();

        try {
            File file = new File(filePath);
            Scanner fileScanner = new Scanner(file);

            int studentID = Integer.parseInt(fileScanner.nextLine().trim());
            Transcript transcript = new Transcript(studentID);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] courseInfo = line.split(" ");
                String department = courseInfo[0];
                int courseCode = Integer.parseInt(courseInfo[1]);
                int courseCredit = Integer.parseInt(courseInfo[2]);
                double gradeValue = Double.parseDouble(courseInfo[3]);

                CourseGrade courseGrade = new CourseGrade(department, courseCode, courseCredit);
                courseGrade.setGradeTaken(gradeValue);
                transcript.addTakenCourse(courseGrade);
            }

            fileScanner.close();
            input.close();
            System.out.println(transcript);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}