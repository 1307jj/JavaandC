class PointB {
    int x, y;

    PointB(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x:" + x + ", y:" + y;
    }
}

class Point3DB extends PointB {
    int z;

    Point3DB(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return super.getLocation() + ", z:" + z;
    }
}

public class Ex44 {
    public static void main(String[] args) {
        PointB p = new PointB(1, 2);
        Point3DB p3 = new Point3DB(1, 2, 3);
        System.out.println(p.getLocation());
        System.out.println(p3.getLocation());
    }
}
