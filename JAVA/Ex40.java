class Point {
    int x;
    int y;
}

class Point3D extends Point {
    int z;
}

public class Ex40 {
    public static void main(String[] args) {
        Point3D p = new Point3D();
        p.x = 1;
        p.y = 2;
        p.z = 3;
        System.out.println("x=" + p.x + ", y=" + p.y + ", z=" + p.z);
    }
}
