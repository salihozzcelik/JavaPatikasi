package Donguler;

import java.util.Scanner;

public class ciftSayiProgram {
    public static void main(String[] args) {
        int k, toplam = 0, sayac = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {
            // Sayının 3 ve 4'e tam bölünüp bölünmediğini kontrol et
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i; // Toplama ekle
                sayac++; // Kaç tane sayı olduğunu say
            }
        }

        // Ortalama hesaplama
        // Eğer sayac 0 ise, hiçbir sayı bulunamadı demektir ve ortalama hesaplanamaz
        if (sayac > 0) {
            ortalama = toplam / (double) sayac; // Ortalamayı hesapla
            System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);
        } else {
            System.out.println("3 ve 4'e tam bölünen hiçbir sayı bulunamadı");
        }
    }
}
