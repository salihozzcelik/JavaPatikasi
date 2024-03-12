package Donguler;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = scanner.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;

        System.out.print(elemanSayisi + " Elemanlı Fibonacci Serisi: ");

        for (int i = 1; i <= elemanSayisi; ++i) {
            System.out.print(sayi1 + " ");

            int toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }

        scanner.close();
    }
}
