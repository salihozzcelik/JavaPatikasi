import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        int sayi, toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        sayi = input.nextInt();

        // Sayının pozitif tam sayı çarpanlarını bulma ve toplama işlemi
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        // Mükemmel sayı kontrolü
        if (toplam == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }

        input.close(); // Scanner nesnesini kapat
    }
}
