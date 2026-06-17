abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() { System.out.println("현재 위치에 정지"); }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("Marine 이동 -> (" + x + "," + y + ")");
    }
    void stimPack() { System.out.println("Marine 스팀팩 사용"); }
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("Tank 이동 -> (" + x + "," + y + ")");
    }
    void changeMode() { System.out.println("Tank 공격모드 변환"); }
}

class Dropship extends Unit {
    void move(int x, int y) {
        System.out.println("Dropship 이동 -> (" + x + "," + y + ")");
    }
    void load()   { System.out.println("Dropship 선택된 대상 태움"); }
    void unload() { System.out.println("Dropship 선택된 대상 내림"); }
}

public class Ex57 {
    public static void main(String[] args) {
        Unit[] group = new Unit[4];
        group[0] = new Marine();
        group[1] = new Tank();
        group[2] = new Marine();
        group[3] = new Dropship();

        for (int i = 0; i < group.length; i++) {
            group[i].move(100, 200);
        }
    }
}
