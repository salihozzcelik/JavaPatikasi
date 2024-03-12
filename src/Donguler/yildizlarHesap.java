import java.util.Scanner;

public class yildizlarHesap {
    public static void main(String[] args) {
        int sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        sayi = input.nextInt();

        // Ters üçgen oluşturma
        for (int i = sayi; i >= 1; i--) {
            for (int j = 1; j <= sayi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close(); // Scanner nesnesini kapat
    }
}
