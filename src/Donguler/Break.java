package Donguler;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // 5 gördüğü yerden sonra tekrar başa dönüyor
            }


            System.out.println(i);
        }


    }


}
