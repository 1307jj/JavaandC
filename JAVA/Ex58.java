interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Object u);
}

interface Fightable extends Movable, Attackable {}

class UnitBase {
    int x, y;
}

class Fighter extends UnitBase implements Fightable {
    public void move(int x, int y) {
        System.out.println("Fighter 이동 -> (" + x + "," + y + ")");
        this.x = x;
        this.y = y;
    }
    public void attack(Object u) {
        System.out.println("Fighter 공격: " + u);
    }
}

public class Ex58 {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());

        Fightable fgt = new Fighter();
        fgt.move(50, 50);
    }
}
