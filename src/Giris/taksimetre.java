package Giris;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, baslangic = 10;


        Scanner input = new Scanner(System.in);
        System.out.println("mesafeyi KM cinsinden giriniz");
        km = input.nextInt();


        total = km * perKm;
        total += baslangic;

        total = (total < 20) ? 20 : total;
        System.out.println("toplam tutar:" + total);


    }


}
