// Ch14 - 3.5 PrintStream printf 포맷
class Ex89 {
    public static void main(String[] args) {
        int i = 65;
        System.out.printf("i=%d%n",   i);
        System.out.printf("i=%5d%n",  i);
        System.out.printf("i=%-5d%n", i);
        System.out.printf("i=%05d%n", i);
        System.out.printf("i=%o%n",   i);
        System.out.printf("i=%x%n",   i);
        System.out.printf("i=%c%n",   i);
        System.out.printf("i=%s%n",   i);

        double d = 1234.56789;
        System.out.printf("d=%f%n",     d);
        System.out.printf("d=%e%n",     d);
        System.out.printf("d=%3.1f%n",  d);
        System.out.printf("d=%8.1f%n",  d);
        System.out.printf("d=%08.1f%n", d);
        System.out.printf("d=%-8.1f%n", d);
    }
}
