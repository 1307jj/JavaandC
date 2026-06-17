// Ch4 - 1.4 switch문 기본 (통신사 번호 매핑)
public class Ex04 {
    public static void main(String[] args) {

        int num = 6;

        switch (num) {
            case 1:
            case 7:
                System.out.println("SK");
                break;
            case 6:
            case 8:
                System.out.println("KTF");
                break;
            case 9:
                System.out.println("LG");
                break;
            default:
                System.out.println("UNKNOWN");
        }
    }
}
