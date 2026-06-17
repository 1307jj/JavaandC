import java.util.Vector;

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price      = price;
        this.bonusPoint = (int)(price / 10.0);
    }
}

class Tv2 extends Product2 {
    Tv2() { super(100); }
    public String toString() { return "Tv"; }
}

class Computer2 extends Product2 {
    Computer2() { super(200); }
    public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
    Audio2() { super(50); }
    public String toString() { return "Audio"; }
}

class Buyer2 {
    int money      = 1000;
    int bonusPoint = 0;
    Vector<Product2> cart = new Vector<>();

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액부족");
            return;
        }
        money      -= p.price;
        bonusPoint += p.bonusPoint;
        cart.add(p);
        System.out.println(p + " 구입");
    }

    void summary() {
        int sum = 0;
        String cartList = "";
        if (cart.isEmpty()) {
            System.out.println("구입한 물건이 없습니다.");
            return;
        }
        for (int i = 0; i < cart.size(); i++) {
            Product2 p = (Product2) cart.get(i);
            sum      += p.price;
            cartList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + cartList + "입니다.");
    }
}

public class Ex56 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
    }
}
