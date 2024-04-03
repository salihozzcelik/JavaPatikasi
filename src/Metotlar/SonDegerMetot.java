package Metotlar;

import java.util.Scanner;

public class SonDegerMetot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();
        scanner.close();

        printSequence(n);
    }

    public static void printSequence(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            System.out.println();
            return;
        } else {
            printSequence(n - 5);
            System.out.print(n + " ");
            if (n > 5) // Eğer n 5'ten büyükse tekrar 5 eklenir
                printSequence(n - 5);
        }
    }
}
