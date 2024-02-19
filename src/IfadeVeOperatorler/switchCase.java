package IfadeVeOperatorler;

public class switchCase {
    public static void main(String[] args) {
        int day = 6;

// swith case karar mekanizmasıdır. değer hangisine uyuyarırsa onu yap demek. if else aynısı ama daha basit

        switch (day) {
            case 1:
                System.out.println("bugün ptesi");
                System.out.println("program bitti");
                break;
            case 2:
                System.out.println("bugün salı");
                break;
            case 3:
                System.out.println("bugün çarş");
                break;
            default:
                System.out.println("hatalı giriş yaptınız");


        }


    }
}
