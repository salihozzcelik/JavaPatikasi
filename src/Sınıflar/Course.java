package Sınıflar;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.name = code;
        this.name = prefix;
        int note = 0;

        void addTeacher(Teacher teacher){
            if (teacher.branch.equals(this.prefix)){
                this.teacher = teacher;
            }else {
                System.out.println("öğretmen ve derse bölümleri uyuşmuyor.");
            }


            this.teacher = teacher;
        }


    }

    void printTeacher() {
        this.teacher.print();
    }

}
