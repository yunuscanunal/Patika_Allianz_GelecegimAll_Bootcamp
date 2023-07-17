package model;

import java.math.BigDecimal;
import java.util.List;

public class DanceCourse {

    private String name;

    private String address;

    private String founder;

    private String taxNumber;

    private String taxOffice;

    private List<BankAccount> bankAccountList;

    private List<PaymentMovement> paymentMovementList;

    private List<Instructor> instructorList;

    private List<Student> studentList;

    private List<Lecture> lectureList;

    //DanceCourse course = new DansCourse();


    public DanceCourse() {
    }

    public DanceCourse(String name) {
        this.name = name;
    }

    public DanceCourse(String name, String taxNumber, String taxOffice) {
        this.name = name;
        this.taxNumber = taxNumber;
        this.taxOffice = taxOffice;
    }

    //DanceCourse course = new DansCourse(name,taxNumber,taxOffice);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getTaxOffice() {
        return taxOffice;
    }

    public void setTaxOffice(String taxOffice) {
        this.taxOffice = taxOffice;
    }

    public List<BankAccount> getBankAccountList() {
        return bankAccountList;
    }

    public void setBankAccountList(List<BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public List<PaymentMovement> getPaymentMovementList() {
        return paymentMovementList;
    }

    public void setPaymentMovementList(List<PaymentMovement> paymentMovementList) {
        this.paymentMovementList = paymentMovementList;
    }

    public List<Instructor> getInstructorList() {
        return instructorList;
    }

    public void setInstructorList(List<Instructor> instructorList) {
        this.instructorList = instructorList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Lecture> getLectureList() {
        return lectureList;
    }

    public void setLectureList(List<Lecture> lectureList) {
        this.lectureList = lectureList;
    }

    @Override
    public String toString() {
        return "DanceCourse{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", founder='" + founder + '\'' +
                ", taxNumber='" + taxNumber + '\'' +
                ", taxOffice='" + taxOffice + '\'' +
                ", bankAccountList=" + bankAccountList +
                ", paymentMovementList=" + paymentMovementList +
                ", instructorList=" + instructorList +
                ", studentList=" + studentList +
                ", lectureList=" + lectureList +
                '}';
    }
}
