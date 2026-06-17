class PointA {
    int x;
    int y;
}

class Shape {
    String color = "blue";
    void draw() {
        System.out.println("도형을 그린다. color=" + color);
    }
}

class Circle extends Shape {
    PointA center;
    int r;

    Circle() {
        this(new PointA(), 100);
    }

    Circle(PointA center, int r) {
        this.center = center;
        this.r = r;
    }
}

class Triangle extends Shape {
    PointA[] p = new PointA[3];

    Triangle(PointA[] p) {
        this.p = p;
    }
}

public class Ex42 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(new PointA(), 50);

        PointA[] pa = {new PointA(), new PointA(), new PointA()};
        pa[0].x = 100; pa[0].y = 100;
        pa[1].x = 140; pa[1].y = 50;
        pa[2].x = 200; pa[2].y = 100;
        Triangle t1 = new Triangle(pa);

        c1.draw();
        c2.draw();
        t1.draw();
        System.out.println("c1 center: (" + c1.center.x + "," + c1.center.y + ") r=" + c1.r);
        System.out.println("c2 center: (" + c2.center.x + "," + c2.center.y + ") r=" + c2.r);
    }
}
