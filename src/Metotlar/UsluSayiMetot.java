package Metotlar;
import java.util.Scanner;

public class UsluSayiMetot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int taban = scanner.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        System.out.println("Sonuç: " + usluHesapla(taban, us));

        scanner.close();
    }

    public static int usluHesapla(int taban, int us) {
        if (us == 0)
            return 1;
        else
            return taban * usluHesapla(taban, us - 1);
    }
}
