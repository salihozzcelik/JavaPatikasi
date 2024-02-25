package IfadeVeOperatorler;

import java.util.Scanner;

public class burcBulmak {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("doğduğunuz ay:");
        month = input.nextInt();

        System.out.print("doğduğunuz gün:");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "oğlak";
                    } else {
                        burc = "kova";
                    }

                } else {
                    isError = true;
                }

                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        burc = "kova;";
                    } else {
                        burc = "balık";
                    }

                } else {
                    isError = true;
                }
                break;


            default:
                isError = true;
        }

        if (isError){
            System.out.print("hatalı giriş yaptınız tekrar deneyin");
        }else {
                System.out.print("burcunuz:"+ burc);
            }


    }

}
