package Giris;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("ücret tutarını giriniz");
        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("kdvsiz tutar" + tutar);
        System.out.println("kdv oranı:" + kdvOran);
        System.out.println("kdv tutarı" + kdvTutar);
        System.out.println("kdv'li tutarı" + kdvliTutar);
        System.out.println(kdvliTutar);


    }
}
