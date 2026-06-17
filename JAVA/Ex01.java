// Ch4 - 1.2 if문 기본 (if / if-else / if-else if)
public class Ex01 {
    public static void main(String[] args) {

        int score = 75;

        // if문
        if (score > 60) {
            System.out.println("합격입니다.");
        }

        // if-else문
        if (score > 60) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }

        // if-else if-else문
        int num = 5;
        if (num > 0) {
            System.out.println("양수입니다.");
        } else if (num < 0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("영입니다.");
        }
    }
}
