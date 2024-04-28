package Sınıflar;

import Sınıflar.Teacher;

public class TeacherMain {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("salih hoca", "5356257733", "salihinbölümü");
        Teacher t2 = new Teacher("ecem hoca", "6257733", "ecembölümü");
        Course tarih = new Course("tarih", "555", "trh");

        tarih.addTeacher(t2);
    }

}
