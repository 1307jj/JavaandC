// Ch9 - 2.4 문자열과 기본형간의 변환
class Ex78 {
    public static void main(String[] args) {
        int i = 100;
        String str1 = i + "";
        String str2 = String.valueOf(i);

        double d = 3.14;
        String str3 = d + "";
        String str4 = String.valueOf(d);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        int i2    = Integer.parseInt("100");
        int i3    = Integer.valueOf("100");
        char c    = "A".charAt(0);
        double d2 = Double.parseDouble("3.14");

        System.out.println(i2);
        System.out.println(i3);
        System.out.println(c);
        System.out.println(d2);
    }
}
