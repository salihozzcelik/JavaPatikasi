package Donguler;

public class asalSayi {
    public static void main(String[] args) {
        System.out.println("1 - 100 arasındaki asal sayılar:");

        // 2 bir asal sayıdır, diğer asal sayıları kontrol etmek için 3'ten başlarız
        System.out.print(2 + " ");

        for (int i = 3; i <= 100; i++) {
            boolean asalMi = true;
            // Asal kontrolü
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            // Eğer asal ise ekrana yazdır
            if (asalMi) {
                System.out.print(i + " ");
            }
        }
    }
}
