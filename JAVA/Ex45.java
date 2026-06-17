class ParentA {
    int x = 10;
}

class ChildA extends ParentA {
    int x = 20;

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}

public class Ex45 {
    public static void main(String[] args) {
        ChildA c = new ChildA();
        c.method();
    }
}
