import Address.Address;
import Insurance.Insurance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class User {
    private String name;
    private String surname;
    private String email;
    private String pw;
    private String job;
    private int age;
    private LocalDate lastLoginDate;
    private List<Address> addressList = new ArrayList<>();

    private List<Insurance> insurances = new ArrayList<>();

    public User(String name, String surname, String email, String pw, String job, int age) {
        super();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.pw = pw;
        this.job = job;
        this.age = age;
        this.lastLoginDate = LocalDate.now();//simdiki tarihi constructor ile ekler
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public List<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

}