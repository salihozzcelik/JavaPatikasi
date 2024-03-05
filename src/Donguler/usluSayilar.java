package Donguler;

import java.util.Scanner;

public class usluSayilar {
    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        k = input.nextInt();

        int sonuc = 1;
        for (int i = 0; i < k; i++) {
            sonuc *= n;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}
