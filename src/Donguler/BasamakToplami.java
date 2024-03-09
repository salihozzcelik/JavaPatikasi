package Donguler;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        int sumOfDigits = findSumOfDigits(number);

        System.out.println(number + " sayısının basamakları toplamı: " + sumOfDigits);
    }

    public static int findSumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
