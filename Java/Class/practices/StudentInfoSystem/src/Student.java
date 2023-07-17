public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String studentNo;
    String classes;
    double average;
    boolean isPassed;

    Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPassed = false;
    }

    void addBulkExamNotes(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void isPassed() {
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.average > 55) {
            System.out.println("Geçtiniz.");
            this.isPassed = true;
        } else {
            System.out.println("Kaldınız.");
            this.isPassed = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println("==============");
        System.out.println(c1.name + "Notunuz: " + c1.note);
        System.out.println(c2.name + "Notunuz: " + c2.note);
        System.out.println(c3.name + "Notunuz: " + c3.note);
        System.out.println("Ortalamanız: " + this.average);
    }
}
