class PointC {
    int x, y;

    PointC(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x:" + x + ", y:" + y;
    }
}

class Point3DC extends PointC {
    int z;

    Point3DC(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return super.getLocation() + ", z:" + z;
    }
}

public class Ex46 {
    public static void main(String[] args) {
        Point3DC p3 = new Point3DC(1, 2, 3);
        System.out.println(p3.getLocation());
    }
}
