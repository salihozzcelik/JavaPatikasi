package Donguler;

public class whileDongusu {
    public static void main(String[] args) {
        int i = 1;
        int k;

        System.out.println("program başladı");
        while (i <= 5) {
            System.out.println(i);

            k = 1;
            while (k <= 10) {
                System.out.print(k + ",");
                k++;
            }
            System.out.println();

            i++;


        }

        System.out.println("program bitti");


    }
}
