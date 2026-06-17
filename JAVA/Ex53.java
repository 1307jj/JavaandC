public class Ex53 {
    public static void main(String[] args) {
        FireEngine2 fe = new FireEngine2();

        if (fe instanceof FireEngine2) System.out.println("This is a FireEngine2 instance.");
        if (fe instanceof Car2)        System.out.println("This is a Car2 instance.");
        if (fe instanceof Object)      System.out.println("This is an Object instance.");
    }

    static void method(Object obj) {
        if (obj instanceof Car2) {
            Car2 c = (Car2) obj;
            c.drive();
        } else if (obj instanceof FireEngine2) {
            FireEngine2 fe = (FireEngine2) obj;
            fe.water();
        }
    }
}

class Car2 {
    void drive() { System.out.println("drive"); }
    void stop()  { System.out.println("stop"); }
}

class FireEngine2 extends Car2 {
    void water() { System.out.println("water!!!"); }
}
