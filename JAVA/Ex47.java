class StaticTest {
    static int width = 200;
    static int height = 120;

    static {
        System.out.println("StaticTest 클래스 초기화 블럭");
    }

    static int max(int a, int b) {
        return a > b ? a : b;
    }
}

public class Ex47 {
    public static void main(String[] args) {
        System.out.println("width=" + StaticTest.width);
        System.out.println("height=" + StaticTest.height);
        System.out.println("max(3,5)=" + StaticTest.max(3, 5));
    }
}
