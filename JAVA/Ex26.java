// Ch6 - 2.5 클래스의 또 다른 정의 (사용자 정의 타입 - Time)
class Time {
    int hour;
    int minute;
    int second;

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

public class Ex26 {
    public static void main(String[] args) {

        // 관련 변수 3개를 하나의 타입으로 묶기
        // int hour, minute, second; → Time 클래스 하나로 해결
        Time t = new Time();
        t.hour   = 9;
        t.minute = 30;
        t.second = 0;

        System.out.println("시각: " + t);

        // 여러 개의 시각을 다룰 때 배열로 관리
        Time[] times = new Time[3];
        times[0] = new Time();
        times[1] = new Time();
        times[2] = new Time();

        times[0].hour =  8; times[0].minute =  0; times[0].second =  0;
        times[1].hour = 12; times[1].minute = 30; times[1].second = 15;
        times[2].hour = 18; times[2].minute = 45; times[2].second = 59;

        System.out.println("\nTime 배열:");
        for (int i = 0; i < times.length; i++) {
            System.out.println("  times[" + i + "] = " + times[i]);
        }
    }
}
