interface Greetable {
    void greet();
}

public class Ex61 {
    public static void main(String[] args) {
        Greetable g1 = new Greetable() {
            public void greet() {
                System.out.println("Hello! (익명클래스 1)");
            }
        };

        Greetable g2 = new Greetable() {
            public void greet() {
                System.out.println("Annyeong! (익명클래스 2)");
            }
        };

        g1.greet();
        g2.greet();
    }
}
