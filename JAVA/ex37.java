class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    Car(Car c) {
        this(c.color, c.gearType, c.door);
    }
}

class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);
        System.out.println("c1 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
        System.out.println("c2 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
        c1.door = 2;
        System.out.println("c1.door=2 변경 후");
        System.out.println("c1 door=" + c1.door);
        System.out.println("c2 door=" + c2.door);
    }
}
