class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price      = price;
        this.bonusPoint = (int)(price / 10.0);
    }
}

class TvP extends Product {
    TvP() { super(100); }
    public String toString() { return "Tv"; }
}

class Computer extends Product {
    Computer() { super(200); }
    public String toString() { return "Computer"; }
}

class Audio extends Product {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}

class Buyer {
    int money      = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        money      -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + " 구입. 남은 돈=" + money + ", 보너스점수=" + bonusPoint);
    }
}

public class Ex55 {
    public static void main(String[] args) {
        Buyer  b   = new Buyer();
        TvP    tv  = new TvP();
        Computer com = new Computer();
        Audio  aud = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(aud);
    }
}
