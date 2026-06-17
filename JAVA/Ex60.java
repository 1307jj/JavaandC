class Outer {
    int value = 10;

    class InstanceInner {
        int iiv = value;
    }

    static class StaticInner {
        static int cv = 200;
        int iv = 100;
    }

    void myMethod() {
        class LocalInner {
            int lv = value;
        }
        LocalInner li = new LocalInner();
        System.out.println("LocalInner lv=" + li.lv);
    }
}

public class Ex60 {
    public static void main(String[] args) {
        Outer oc = new Outer();
        Outer.InstanceInner ii = oc.new InstanceInner();
        System.out.println("InstanceInner iiv=" + ii.iiv);

        Outer.StaticInner si = new Outer.StaticInner();
        System.out.println("StaticInner iv=" + si.iv);
        System.out.println("StaticInner cv=" + Outer.StaticInner.cv);

        oc.myMethod();
    }
}
