package service;

import model.Instructor;
import model.Sex;

import java.math.BigDecimal;

public class InstructorService {


    public Instructor createInstructor(String name, int age, Sex sex, BigDecimal salary) {

        Instructor instructor = new Instructor();
        instructor.setName(name);
        instructor.setAge(age);
        instructor.setSex(sex);
        instructor.setSalary(salary);
        return instructor;
    }





}
