package Sınıflar;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve dersin bölümleri uyuşmuyor.");
        }
    }

    void printTeacher() {
        if (teacher != null) {
            this.teacher.print();
        } else {
            System.out.println("Öğretmen atanmamış.");
        }
    }
}
