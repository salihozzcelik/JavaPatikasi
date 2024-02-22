package IfadeVeOperatorler;

import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("matematik notunuz");
        mat = input.nextInt();

        System.out.println("fizik notunuz");
        fizik = input.nextInt();

        System.out.println("turkce notunuz");
        turkce = input.nextInt();

        System.out.println("kimya notunuz");
        kimya = input.nextInt();

        System.out.println("muzik notunuz");
        muzik = input.nextInt();

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55) {
            System.out.println("sınıftı kaldınız");
        } else {
            System.out.println("tebrikler gectiniz");
        }
        System.out.println("ortalamanız " + avarage);

    }
}
