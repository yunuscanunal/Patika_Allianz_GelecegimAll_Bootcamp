package main;

import java.util.ArrayList;

public class Transcript {
    int StudentId;
    ArrayList<CourseGrade> courseGradeArrayList;
    double GPA;

    public Transcript(int StudentId) {
        this.StudentId = StudentId;
        this.GPA = 0.0;
        this.courseGradeArrayList = new ArrayList<>();
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
}
