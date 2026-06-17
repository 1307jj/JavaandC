class MyMath3 {
    int add(int a, int b) { return a + b; }
    long add(long a, long b) { return a + b; }
    int add(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}

class ex36 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("add(3, 3) = " + mm.add(3, 3));
        System.out.println("add(3L, 3L) = " + mm.add(3L, 3L));
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("add(a) = " + mm.add(a));
    }
}
