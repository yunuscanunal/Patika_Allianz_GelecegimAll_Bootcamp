package main;

import java.util.ArrayList;
import java.util.Locale;

public class Transcript {
    private ArrayList<CourseGrade> courseGradeArrayList;
    private int studentId;
    private double GPA;

    public Transcript(int StudentId) {
        this.studentId = StudentId;
        this.GPA = 0.0;
        this.courseGradeArrayList = new ArrayList<>();
    }

    public Transcript(){

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void addTakenCourse(CourseGrade courseGrade) {
        if (courseGrade != null) {
            this.courseGradeArrayList.add(courseGrade);
            double totalGrade = 0;
            for (CourseGrade courseGrade1 : this.courseGradeArrayList) {
                totalGrade += (double) courseGrade1.getGradeTaken().getNumericValue() / (double) this.courseGradeArrayList.size();
            }
            this.GPA = totalGrade;
        } else {
            System.out.println("CourseGrade cannot be null!");
        }
    }

    @Override
    public String toString() {
        return "Transcript{" +
                "Student ID: " + this.studentId + "\n" + this.courseGradeArrayList.toString()
                .replaceAll("\\[", "")
                .replaceAll(", ", "")
                .replaceAll("]", "")
                + "GPA: " + String.format(Locale.US, "%.2f", this.GPA);
    }
}
