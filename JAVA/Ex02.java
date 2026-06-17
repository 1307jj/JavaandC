// Ch4 - 1.2 if문 점수별 등급 판정
public class Ex02 {
    public static void main(String[] args) {

        int score = 85;

        if (score >= 90) {
            System.out.println("A등급");
        } else if (score >= 80 && score < 90) {
            System.out.println("B등급");   // 80 <= score < 90
        } else if (score >= 70 && score < 80) {
            System.out.println("C등급");   // 70 <= score < 80
        } else {                           // score < 70
            System.out.println("F등급");
        }
    }
}
