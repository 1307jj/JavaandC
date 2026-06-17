// Ch9 - 4.1 Math클래스
class Ex81 {
    public static void main(String[] args) {
        System.out.println("Math.abs(-10)     = " + Math.abs(-10));
        System.out.println("Math.abs(-10.0)   = " + Math.abs(-10.0));
        System.out.println("Math.ceil(10.1)   = " + Math.ceil(10.1));
        System.out.println("Math.ceil(-10.1)  = " + Math.ceil(-10.1));
        System.out.println("Math.floor(10.8)  = " + Math.floor(10.8));
        System.out.println("Math.floor(-10.8) = " + Math.floor(-10.8));
        System.out.println("Math.max(9.5, 9.50001) = " + Math.max(9.5, 9.50001));
        System.out.println("Math.min(9.5, 9.50001) = " + Math.min(9.5, 9.50001));
        System.out.println("Math.random()     = " + Math.random());
        System.out.println("Math.rint(5.55)   = " + Math.rint(5.55));
        System.out.println("Math.rint(-5.55)  = " + Math.rint(-5.55));
        System.out.println("Math.round(5.55)  = " + Math.round(5.55));
        System.out.println("Math.round(-5.55) = " + Math.round(-5.55));

        double d = 90.7552;
        System.out.println("Math.round(d*100)/100.0 = " + Math.round(d * 100) / 100.0);

        int x = 50;
        x = Math.min(Math.max(10, x), 100);
        System.out.println("x = " + x);
    }
}
