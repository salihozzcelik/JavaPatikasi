package Giris;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        //değişken oluşturma
        int a, b;
        double c;

        // kullanıcıdan veri alma
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.kenarı giriniz");

        a = girdi.nextInt();
        System.out.print("ikinci kenarı giriniz");
        b = girdi.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("hipotenus" + c);


    }


}
