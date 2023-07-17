package model;

import java.util.List;
import java.util.Set;

public class Lecture {

    private String name;

    private Instructor instructor;

    private Branch branch;

    private int capacity;

    private Set<LectureScheduleTime> lectureScheduleTimeSet;

    private List<Student> studentList;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Set<LectureScheduleTime> getLectureScheduleTimeSet() {
        return lectureScheduleTimeSet;
    }

    public void setLectureScheduleTimeSet(Set<LectureScheduleTime> lectureScheduleTimeSet) {
        this.lectureScheduleTimeSet = lectureScheduleTimeSet;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                ", instructor=" + instructor +
                ", branch=" + branch +
                ", capacity=" + capacity +
                ", lectureScheduleTimeSet=" + lectureScheduleTimeSet +
                ", studentList=" + studentList +
                '}';
    }
}
