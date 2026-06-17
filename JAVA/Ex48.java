final class FinalTest {
    final int MAX_SIZE = 10;

    final int getMaxSize() {
        final int LV = MAX_SIZE;
        return LV;
    }
}

class Card {
    final int NUMBER;
    final String KIND;
    static int width  = 100;
    static int height = 250;

    Card(String kind, int num) {
        KIND   = kind;
        NUMBER = num;
    }

    Card() {
        this("HEART", 1);
    }

    public String toString() {
        return "" + KIND + " " + NUMBER;
    }
}

public class Ex48 {
    public static void main(String[] args) {
        FinalTest ft = new FinalTest();
        System.out.println("MAX_SIZE=" + ft.MAX_SIZE);
        System.out.println("getMaxSize()=" + ft.getMaxSize());

        Card c = new Card("HEART", 10);
        System.out.println(c);
        System.out.println("KIND=" + c.KIND + ", NUMBER=" + c.NUMBER);
    }
}
