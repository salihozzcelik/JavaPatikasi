package Donguler;

import java.util.Scanner;

public class KombinasyonHesaplama {
    // Faktoriyel hesaplamak için ayrı bir metod
    public static int faktoriyel(int n) {
        int faktoriyel = 1;
        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }

    // Kombinasyon hesaplamak için ayrı bir metod
    public static int kombinasyon(int n, int r) {
        // n! / (r! * (n-r)!) formülü
        int kombinasyon = faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
        return kombinasyon;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        int n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        int r = input.nextInt();

        // Hesaplanan kombinasyon sonucu
        int sonuc = kombinasyon(n, r);
        System.out.println("C(" + n + "," + r + ") = " + sonuc);
    }
}
