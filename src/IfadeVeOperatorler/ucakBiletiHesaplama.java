package IfadeVeOperatorler;

import java.util.Scanner;

public class ucakBiletiHesaplama {
    public static void main(String[] args) {
        double mesafe, yas, normalTutar, yasIndirimi=0, indirimliTutar, toplamTutar=0;
        int yolculukTipi;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextDouble();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();

        if (mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            normalTutar = mesafe * 0.10;

            if (yas < 12) {
                yasIndirimi = normalTutar * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimi = normalTutar * 0.10;
            } else if (yas > 65) {
                yasIndirimi = normalTutar * 0.30;
            }

            indirimliTutar = normalTutar - yasIndirimi;

            if (yolculukTipi == 2) {
                toplamTutar = (indirimliTutar - (indirimliTutar * 0.20)) * 2;
            } else {
                toplamTutar = indirimliTutar;
            }

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        }
    }
}
