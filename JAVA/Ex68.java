// Ch8 - 1.9 메서드에 예외 선언하기 예제1
class Ex68 {
    public static void main(String[] args) throws Exception {
        method1();
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
