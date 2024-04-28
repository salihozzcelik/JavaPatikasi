public class Car {
    // nitelikler
    String type;
    String model =  "test";
    String color;
    int speed;

    Car (String model, int speed) {
        System.out.println(this.model);
    }

    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println("Speed : " + speed);
    }
    // ...
}