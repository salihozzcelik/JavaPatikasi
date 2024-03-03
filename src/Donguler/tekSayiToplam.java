package Donguler;

import java.util.Scanner;

public class tekSayiToplam {
    public static void main(String[] args) {
        int n;
        int toplam = 0;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz: ");
            n = scan.nextInt();

            // Çift ve 4'ün katı olan sayıları kontrol et ve topla
            if (n % 2 == 0 && n % 4 == 0) {
                toplam += n; // toplam = toplam + n;
            }
        } while (n % 2 == 0); // Tek sayı girilene kadar döngü devam eder

        System.out.println("Çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
}
