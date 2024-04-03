package Metotlar;
import java.util.Scanner;

public class AsalSayiMetot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi))
            System.out.println(sayi + " sayısı ASALDIR !");
        else
            System.out.println(sayi + " sayısı ASAL değildir !");

        scanner.close();
    }

    public static boolean asalMi(int sayi) {
        if (sayi <= 1)
            return false;
        if (sayi <= 3)
            return true;
        if (sayi % 2 == 0 || sayi % 3 == 0)
            return false;

        return asalKontrol(sayi, 5);
    }

    public static boolean asalKontrol(int sayi, int i) {
        if (i * i > sayi)
            return true;
        if (sayi % i == 0 || sayi % (i + 2) == 0)
            return false;

        return asalKontrol(sayi, i + 6);
    }
}
