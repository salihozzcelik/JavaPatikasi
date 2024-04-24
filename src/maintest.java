public class maintest {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi A3";
        audi.speed = 10;
        audi.increaseSpeed(20);
        System.out.println(audi.model + " hızı: " + audi.speed);

        Car bmw = new Car();
        bmw.model ="bmw";
        bmw.speed = 20;
        System.out.println(bmw.model + " hızı: " + bmw.speed);



        Car mercedes = new Car();

    }
}
