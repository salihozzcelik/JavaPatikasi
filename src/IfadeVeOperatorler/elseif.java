package IfadeVeOperatorler;

public class elseif {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 1;

        if (a < b && a < c) {
            System.out.println("a en küçüktür");


        } else if (b < a && b < c) {
            System.out.println("b en küçük sayıdır");
        } else  {
            System.out.println("c sayısı en küçüktür");
        }


    }


}
