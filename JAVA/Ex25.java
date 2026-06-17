// Ch6 - 2.4 두 개의 인스턴스 (3/4)
// Tv 클래스는 Ch6_Ex01_Tv_Instance.java에 정의되어 있으므로
// 여기서는 독립 실행을 위해 다시 선언

class Tv2 {
    String  color;
    boolean power;
    int     channel;
    void power()       { power = !power; }
    void channelUp()   { channel++; }
    void channelDown() { channel--; }
}

public class Ex25 {
    public static void main(String[] args) {

        Tv2 t1 = new Tv2();   // 인스턴스 1
        Tv2 t2 = new Tv2();   // 인스턴스 2 (별개의 객체)

        t1.channel = 7;
        t2.channel = 3;

        System.out.println("대입 전:");
        System.out.println("  t1.channel = " + t1.channel);
        System.out.println("  t2.channel = " + t2.channel);

        // t2 = t1 → t2가 t1과 같은 인스턴스를 가리킴
        // 기존 t2 인스턴스는 참조 없어짐 (GC 대상)
        t2 = t1;

        System.out.println("t2 = t1 대입 후:");
        System.out.println("  t1.channel = " + t1.channel);
        System.out.println("  t2.channel = " + t2.channel);  // t1과 동일

        // t1을 통해 변경하면 t2에도 반영됨 (같은 객체이므로)
        t1.channel = 77;
        System.out.println("t1.channel = 77 변경 후:");
        System.out.println("  t2.channel = " + t2.channel);  // 77
    }
}
