package Donguler;
import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = ebobBul(sayi1, sayi2);
        int ekok = ekokBul(sayi1, sayi2, ebob);

        System.out.println("Girilen sayıların EBOB'u: " + ebob);
        System.out.println("Girilen sayıların EKOK'u: " + ekok);
    }

    public static int ebobBul(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public static int ekokBul(int a, int b, int ebob) {
        return (a * b) / ebob;
    }
}
