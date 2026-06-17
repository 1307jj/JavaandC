// Ch9 - 3.1 StringBuffer 특징 / 3.2 메서드
class Ex80 {
    public static void main(String[] args) {
        StringBuffer sb  = new StringBuffer("abc");
        StringBuffer sb2 = sb.append(true);
        sb.append('d').append(10.0f);
        StringBuffer sb3 = sb.append("ABC").append(123);

        System.out.println(sb);
        System.out.println(sb2);
        System.out.println(sb3);

        System.out.println("capacity : " + sb.capacity());
        System.out.println("length   : " + sb.length());

        StringBuffer sb4 = new StringBuffer("0123456");
        System.out.println(sb4.delete(3, 6));
        System.out.println(sb4.deleteCharAt(3));
        System.out.println(sb4.insert(3, '.'));
        System.out.println(sb4.replace(3, 6, "AB"));
        System.out.println(sb4.reverse());

        StringBuffer sb5 = new StringBuffer("0123456");
        System.out.println(sb5.substring(3));
        System.out.println(sb5.substring(3, 5));

        StringBuffer sb6 = new StringBuffer("abc");
        StringBuffer sb7 = new StringBuffer("abc");
        System.out.println(sb6 == sb7);
        System.out.println(sb6.equals(sb7));
        String s  = sb6.toString();
        String s2 = sb7.toString();
        System.out.println(s.equals(s2));
    }
}
