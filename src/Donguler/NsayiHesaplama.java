import java.util.Scanner;

public class NsayiHesaplama {
    public static void main(String[] args) {
        int n;
        int min = Integer.MAX_VALUE; // En küçük sayıyı saklamak için başlangıç değeri
        int max = Integer.MIN_VALUE; // En büyük sayıyı saklamak için başlangıç değeri

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz:");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ". Sayıyı giriniz:");
            int num = input.nextInt();
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

        input.close(); // Scanner nesnesini kapat
    }
}
