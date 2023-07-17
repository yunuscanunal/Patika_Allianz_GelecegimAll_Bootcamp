public class Teacher {
    String name;
    String phoneNumber;
    String branch;

    Teacher(String name, String phoneNumber, String branch){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    void print(){
        System.out.println("Ad: " + this.name);
        System.out.println("Tel. No: " + this.phoneNumber);
        System.out.println("Bölümü: " + this.branch);
    }

}
