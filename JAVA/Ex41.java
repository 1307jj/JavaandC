class Parent {
    int x = 10;
    void parentMethod() {
        System.out.println("ParentMethod()");
    }
}

class Child extends Parent {
    int x = 20;
    void childMethod() {
        System.out.println("ChildMethod()");
    }
}

class Child2 extends Parent {}

class GrandChild extends Child {}

public class Ex41 {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        gc.parentMethod();
        gc.childMethod();
        System.out.println("gc.x=" + gc.x);
    }
}
