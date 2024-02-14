package Giris;

import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        // Sabit fiyatlar
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullanıcıdan alınacak kilogram değerleri için değişkenler
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan kilogram değerlerinin alınması
        System.out.print("Armut kaç kilo? : ");
        armutKg = input.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elmaKg = input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domatesKg = input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlicanKg = input.nextDouble();

        // Toplam tutarın hesaplanması
        double toplamTutar = (armutKg * armutFiyat) + (elmaKg * elmaFiyat) +
                (domatesKg * domatesFiyat) + (muzKg * muzFiyat) +
                (patlicanKg * patlicanFiyat);

        // Sonucun ekrana yazdırılması
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
