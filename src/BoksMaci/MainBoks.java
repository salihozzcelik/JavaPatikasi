package BoksMaci;

public class MainBoks {
    public static void main(String[] args) {
        Fighter marc = new Fighter("salih" , 10 , 100, 90, 0);
        Fighter alex = new Fighter("ecem" , 10 , 90, 90, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}
