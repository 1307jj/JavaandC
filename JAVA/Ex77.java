// Ch9 - 2.1 String클래스의 특징 / 2.3 intern()
class Ex77 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str4));

        boolean b  = (str3 == str4);
        boolean b2 = str3.equals(str4);
        boolean b3 = (str3.intern() == str4.intern());
        System.out.println("b=" + b + ", b2=" + b2 + ", b3=" + b3);
    }
}
