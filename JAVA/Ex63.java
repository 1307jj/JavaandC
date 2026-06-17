// Ch8 - 1.4 try-catch문에서의 흐름 (예외 발생 O)
class Ex63 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
