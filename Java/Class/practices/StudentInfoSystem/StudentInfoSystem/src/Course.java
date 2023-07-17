public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        note = 0; // default olarak 0 tanımladık.
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve Ders Kodları uyuşmuyor!");
        }

    }

    void printTeacher() {
        this.teacher.print(); // run print function of Teacher class at Course Class.
    }
}
