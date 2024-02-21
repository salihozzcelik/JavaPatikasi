package IfadeVeOperatorler;

import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {
        String username, password;

     Scanner inp = new Scanner(System.in);

        System.out.println("kullanıcı adınız");
        username = inp.nextLine();

        System.out.println("şifreniz");
        password = inp.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("giriş yaptınız");
        }else {
            System.out.println("bilgileriniz yanlış");
        }


    }
}
