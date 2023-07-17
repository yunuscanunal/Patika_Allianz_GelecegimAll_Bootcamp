public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    double sozluAgirligi;

    Course(String name, String code, String prefix, double sozluAgirligi) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        note = 0; // default olarak 0 tanımladık.
        this.sozluAgirligi = sozluAgirligi;
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

    public double calculateCourseAverage(double sınavNotu, double sozluNotu) {
        double agirlikliSınavNotu = sınavNotu * (1 - sozluAgirligi);
        double agirlikliSozluNotu = sozluNotu * sozluAgirligi;
        double dersOrtalamasi = agirlikliSınavNotu + agirlikliSozluNotu;
        return dersOrtalamasi;
    }
}
