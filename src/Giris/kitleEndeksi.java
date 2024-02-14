package Giris;

import java.util.Scanner;

public class kitleEndeksi {
    public static void main(String[] args) {

        int kilo;
        double boy, vki;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextInt();

        // Vücut Kitle İndeksi hesaplama
        vki = kilo / (boy * boy);

        // Sonucu ekrana yazdır
        System.out.println("Vücut Kitle İndeksiniz: " + vki);


    }

}
