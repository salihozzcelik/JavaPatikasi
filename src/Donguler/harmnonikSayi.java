package Donguler;

import java.util.Scanner;

public class harmnonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n sayısını gitiniz:");
        int n = input.nextInt();
        double result = 0;

        for (int i = 1; i <=n; i++) {
            result += (1.0/i);

        }

        System.out.println(result);



    }
}
