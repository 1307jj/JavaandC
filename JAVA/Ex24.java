// Ch6 - 2.3 + 2.4 Tv 클래스 정의 & 인스턴스 생성/사용
class Tv {
    // 속성(변수)
    String  color;      // 색깔
    boolean power;      // 전원 상태 (on/off)
    int     channel;    // 채널

    // 기능(메서드)
    void power()       { power = !power; }   // 전원 on/off
    void channelUp()   { channel++; }        // 채널 높이기
    void channelDown() { channel--; }        // 채널 낮추기

    void showStatus() {
        System.out.println("  color=" + color
            + ", power=" + power + ", channel=" + channel);
    }
}

public class Ex24 {
    public static void main(String[] args) {

        Tv t;           // 참조변수 선언 (객체를 다루기 위한 변수)
        t = new Tv();   // 인스턴스 생성 → 주소를 t에 저장

        // 멤버변수 접근
        t.color   = "검정";
        t.channel = 7;

        // 메서드 호출
        t.power();              // 전원 on (false → true)
        System.out.print("초기 상태: ");
        t.showStatus();

        t.channelUp();
        System.out.print("channelUp: ");
        t.showStatus();

        t.channelDown();
        t.channelDown();
        System.out.print("channelDown x2: ");
        t.showStatus();
    }
}
