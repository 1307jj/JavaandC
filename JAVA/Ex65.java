// Ch8 - 1.7 예외의 발생과 catch블럭 (instanceOf, getMessage)
class Ex65 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
            }
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
