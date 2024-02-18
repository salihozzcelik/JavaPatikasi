package IfadeVeOperatorler;

public class kodBloklarindanifveElse {
    public static void main(String[] args) {
        int a = 20, b = 20;
        boolean compare = a == b;
        // String str = compare ? "eşittir" : "eşit değildir";
        //System.out.println(str);


        if (compare) {
            a = 50;
            System.out.println("a sayısı:" + a);
            System.out.println("eşittir");

        } else {
            System.out.println("eşit değildir");
        }


    }


}
