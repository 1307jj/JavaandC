class TestClass {
    void instanceMethod() {}
    static void staticMethod() {}

    void instanceMethod2() {
        instanceMethod();
        staticMethod();
    }

    static void staticMethod2() {
        // instanceMethod(); // 에러
        staticMethod();
    }
}

class TestClass2 {
    int iv;
    static int cv;

    void instanceMethod() {
        System.out.println(iv);
        System.out.println(cv);
    }

    static void staticMethod() {
        // System.out.println(iv); // 에러
        System.out.println(cv);
    }
}

class ex35 {
    public static void main(String[] args) {
        TestClass2.cv = 10;
        TestClass2 tc = new TestClass2();
        tc.iv = 20;
        tc.instanceMethod();
        TestClass2.staticMethod();
    }
}
