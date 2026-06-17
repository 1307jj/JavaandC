// Ch4 - 1.4 switch문 (score/10으로 학점 처리)
public class Ex05 {
    public static void main(String[] args) {

        int score = 83;
        char grade;

        switch (score / 10) {
            case 10:
            case 9:  grade = 'A'; break;
            case 8:  grade = 'B'; break;
            case 7:  grade = 'C'; break;
            case 6:  grade = 'D'; break;
            default: grade = 'F';
        }

        System.out.println("score=" + score + " → grade=" + grade);
    }
}
