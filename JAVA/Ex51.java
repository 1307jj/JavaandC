class TvD {
    boolean power;
    int channel;

    void power()       { power = !power; }
    void channelUp()   { ++channel; }
    void channelDown() { --channel; }
}

class CaptionTv extends TvD {
    String text;
    void caption() { System.out.println("caption: " + text); }
}

public class Ex51 {
    public static void main(String[] args) {
        CaptionTv c = new CaptionTv();
        TvD      t  = new CaptionTv();

        t.channelUp();
        System.out.println("t.channel=" + t.channel);

        c.text = "Hello Caption!";
        c.caption();
    }
}
