// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher ("Mahmut Hoca", "02582222222", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "02581111111", "FZK");
        Teacher t3 = new Teacher("asda ASDAD", "02583333333", "MAT");

        Course tarih = new Course("Tarih", "101", "TRH", 0.2);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "101", "FZK", 0.3);
        fizik.addTeacher(t2);

        Course matematik = new Course("Matematik", "101", "MAT", 0.35);
        matematik.addTeacher(t3);

        Student s1 = new Student("Yunuscan Ünal", "123", "4", tarih, fizik, matematik);
        s1.addBulkExamNotes(100, 50, 0);
        s1.isPassed();

        Student s2 = new Student("Ayşenur Çakır", "1234", "4", tarih, fizik, matematik);
        s2.addBulkExamNotes(100, 100, 100);
        s2.isPassed();
    }
}