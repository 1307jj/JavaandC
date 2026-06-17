// Ch9 - 1.5 clone()
class Point implements Cloneable {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return obj;
    }
}

class Circle implements Cloneable {
    Point p;
    double r;

    Circle(Point p, double r) {
        this.p = p;
        this.r = r;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
        }
        Circle c = (Circle) obj;
        c.p = new Point(this.p.x, this.p.y);
        return c;
    }

    public String toString() {
        return p.toString() + ", r=" + r;
    }
}

class Ex76 {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point(10, 20), 2.0);
        Circle c2 = (Circle) c1.clone();

        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);

        c1.p.x = 9;
        c1.p.y = 5;
        System.out.println("c1 변경 후:");
        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
    }
}
