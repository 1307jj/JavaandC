class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }
    long subtract(long a, long b) { return a - b; }
    long multiply(long a, long b) { return a * b; }
    double divide(double a, double b) { return a / b; }
}

class ex29 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long value = mm.add(1L, 2L);
        System.out.println("add(1L, 2L) = " + value);
        System.out.println("subtract(5L, 3L) = " + mm.subtract(5L, 3L));
        System.out.println("multiply(3L, 4L) = " + mm.multiply(3L, 4L));
        System.out.println("divide(6.0, 2.0) = " + mm.divide(6.0, 2.0));
    }
}
