import java.util.Scanner;

public class zarOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hedef tur sayısını kullanıcıdan al
        int hedefTurSayisi;
        do {
            System.out.print("Hedef tur sayısını giriniz (1-99): ");
            hedefTurSayisi = scanner.nextInt();
        } while (hedefTurSayisi < 1 || hedefTurSayisi > 99);

        // Oyuncuların başlangıç puanlarını ve tur sayısını tanımla
        int oyuncu1Puan = 0, oyuncu2Puan = 0, oyuncu3Puan = 0;
        int tur = 1;

        // Hedef tur sayısına ulaşılana kadar oyunu oyna
        while (tur <= hedefTurSayisi) {
            System.out.println("\nTur " + tur + ":");

            // Her oyuncunun zar atması
            int zar1 = zarAt();
            int zar2 = zarAt();
            int zar3 = zarAt();

            // Zarların değerlerini yazdır
            System.out.println("Oyuncu 1: " + zar1);
            System.out.println("Oyuncu 2: " + zar2);
            System.out.println("Oyuncu 3: " + zar3);

            // Zarların karşılaştırılması ve puanların güncellenmesi
            if (zar1 == zar2 && zar2 == zar3) {
                int bonus = zar1;
                oyuncu1Puan += bonus;
                oyuncu2Puan += bonus;
                oyuncu3Puan += bonus;
            } else if (zar1 == zar2 && zar2 != zar3) {
                oyuncu1Puan += zar1;
                oyuncu2Puan += zar2 * 2;
                oyuncu3Puan += zar3;
            } else if (zar1 == zar3 && zar1 != zar2) {
                oyuncu1Puan += zar1;
                oyuncu2Puan += zar2;
                oyuncu3Puan += zar3 * 2;
            } else if (zar2 == zar3 && zar2 != zar1) {
                oyuncu1Puan += zar1;
                oyuncu2Puan += zar2;
                oyuncu3Puan += zar3 * 2;
            } else {
                oyuncu1Puan += zar1;
                oyuncu2Puan += zar2;
                oyuncu3Puan += zar3;
            }

            // Oyuncuların toplam puanlarını yazdır
            System.out.println("Oyuncu 1 Toplam Puan: " + oyuncu1Puan);
            System.out.println("Oyuncu 2 Toplam Puan: " + oyuncu2Puan);
            System.out.println("Oyuncu 3 Toplam Puan: " + oyuncu3Puan);

            // Bir sonraki tur için tur sayısını arttır
            tur++;
        }

        // Oyun bittiğinde sonuçları yazdır
        System.out.println("\nOyun bitti!");
        System.out.println("Oyuncu 1 Toplam Puan: " + oyuncu1Puan);
        System.out.println("Oyuncu 2 Toplam Puan: " + oyuncu2Puan);
        System.out.println("Oyuncu 3 Toplam Puan: " + oyuncu3Puan);

        scanner.close();
    }

    // Zar atma fonksiyonu
    public static int zarAt() {
        return (int) (Math.random() * 6) + 1;
    }
}
