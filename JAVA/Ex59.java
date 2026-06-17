interface Repairable {}

class UnitR {
    int hitPoint;
    final int MAX_HP;
    UnitR(int hp) { MAX_HP = hp; }
}

class GroundUnit extends UnitR {
    GroundUnit(int hp) { super(hp); }
}

class AirUnit extends UnitR {
    AirUnit(int hp) { super(hp); }
}

class TankR extends GroundUnit implements Repairable {
    TankR() {
        super(150);
        hitPoint = MAX_HP;
    }
    public String toString() { return "Tank"; }
}

class MarineR extends GroundUnit {
    MarineR() {
        super(40);
        hitPoint = MAX_HP;
    }
    public String toString() { return "Marine"; }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof UnitR) {
            UnitR u = (UnitR) r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println(u + " 수리 완료. HP=" + u.hitPoint);
        }
    }
}

public class Ex59 {
    public static void main(String[] args) {
        TankR   tank   = new TankR();
        MarineR marine = new MarineR();
        SCV     scv    = new SCV();

        tank.hitPoint = 70;
        System.out.println("수리 전 Tank HP=" + tank.hitPoint);
        scv.repair(tank);
    }
}
