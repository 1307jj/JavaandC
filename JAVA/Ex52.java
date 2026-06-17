class Car {
    String color;
    int door;

    void drive() { System.out.println("drive, Brrrr~"); }
    void stop()  { System.out.println("stop!!!"); }
}

class FireEngine extends Car {
    void water() { System.out.println("water!!!"); }
}

class Ambulance extends Car {
    void siren() { System.out.println("siren~~~"); }
}

public class Ex52 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe  = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        car.drive();

        fe2 = (FireEngine) car;
        fe2.water();
    }
}
