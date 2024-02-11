import java.util.Scanner;        // scanner sınıfını dahil ettik

public class Main {
    public static void main(String[] args) {
        System.out.println("Java 101 Patikası \nBaşlıyoruz");
        int numberOne, numberTwo = 10, numberThree;
        numberOne = 5;
        numberThree = numberOne + numberTwo;
        System.out.println(numberThree);

        byte vbyte = 100;
        System.out.println(vbyte);

        short vshort = 1000;
        System.out.println(vshort);

        float vfloat = 3F;
        System.out.println(vfloat);

        char vChar = 'b';
        System.out.println(vChar);

        char vchar2 = 98;
        System.out.println(vchar2);

        char c1 = 'a';
        char c2 = 'b';
        char c3 = 'c';
        System.out.println("" + c1 + c2 + c3); // değer tanımlıyoruz

        boolean dogru = true;
        boolean yanlis = false;
        System.out.println(dogru);
        System.out.println(yanlis); // boolen doğru ve yanlışta kullanıyoruz

        String vStr = "Java Patikası";
        System.out.println(vStr);

        int c = 7;
        int d = c;
        System.out.println(c + d); // değişken atayıp örnek yapıyoruz // atama operatörü

        boolean sonuc = (1 == 5);     // a!=b ünlem gelirse eşir değil anlamını taşr
        System.out.println(sonuc);  // çift eşittir kullanıyoruz sorgulama durumunda, tek eşittir atama operatörü   // karşılaştırma operatörü

        // Mantıksal operatörler örneği

        int e = 5, f=1, g=5;
        boolean sonuc1 = e > f;
        boolean sonuc2 = e >=g;
        boolean sonuc3 = sonuc1 && sonuc2;
        System.out.println(sonuc3);         // ve: a && b veya: a || b   değil: !(a&&b)

        String str = (sonuc3) ? "doğru": "değil";  // Koşul Operatörü  // String ekrana metin yazdırmak için değişken tanımlama
        System.out.println(str);

        // kullanıcıdan veri alma

        int salih;

        Scanner input = new Scanner(System.in);    // scanner sınıfından nesne üretiyoruz
        System.out.print("bir değer giriniz:");
        salih = input.nextInt();

        System.out.println(salih);








    }
}