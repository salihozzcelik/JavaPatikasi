package Donguler;

import java.util.Scanner;

public class yildizDongu {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = klavye.nextInt();

        int i = 0;

        // Elmasın üst kısmını oluşturma
        while (i <= n) {
            int j = 0;
            // Boşlukları yazdır
            while (j < (n - i)) {
                System.out.print(" ");
                j++;
            }

            int k = 0;
            // Yıldızları yazdır
            while (k < (2 * i + 1)) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i++;
        }

        // Elmasın alt kısmını oluşturma
        i = n - 1;
        while (i >= 0) {
            int j = 0;
            // Boşlukları yazdır
            while (j < (n - i)) {
                System.out.print(" ");
                j++;
            }

            int k = 0;
            // Yıldızları yazdır
            while (k < (2 * i + 1)) {
                System.out.print("*");
                k++;
            }

            System.out.println();
            i--;
        }
    }
}
