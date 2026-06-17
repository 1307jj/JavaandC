// Ch4 - 1.3 중첩 if문 (A+/A/A-/B+/B/B-/C 세분화)
public class Ex03 {
    public static void main(String[] args) {

        int score = 95;
        String grade = "";

        if (score >= 90) {
            grade = "A";
            if (score >= 98) {
                grade += "+";
            } else if (score < 94) {
                grade += "-";
            }
        } else if (score >= 80) {
            grade = "B";
            if (score >= 88) {
                grade += "+";
            } else if (score < 84) {
                grade += "-";
            }
        } else {
            grade = "C";
        }

        System.out.println("score=" + score + ", grade=" + grade);
    }
}
