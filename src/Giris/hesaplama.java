package Giris;

// not ortalaması hesaplayan program

import java.util.Scanner;

public class hesaplama {
    public static void main(String[] args) {
        // değişkenleri oluştur

        int mat, fizik, turkce;

        // scanner sınıfını tanımladık
        Scanner inp = new Scanner(System.in);
        System.out.println();


        // kullanıcıdan değerleri al

        System.out.println("matematik notunuz:");
        mat = inp.nextInt();
        System.out.println("fizik notunuz:");
        fizik = inp.nextInt();
        System.out.println("türkçe notunuz:");
        turkce = inp.nextInt();

        int toplam = (mat + fizik + turkce);
        double sonuc = toplam / 3.0;
        System.out.println("ortalamanız:" + sonuc);

       String durum = sonuc >=50 ? "geçti": "kaldı";
        System.out.println(durum);


    }

}
