// Ch5 - 1.4 배열의 활용 (.length로 합계/평균)
public class Ex17 {
    public static void main(String[] args) {

        int[] score = {100, 90, 80, 70, 60, 50};

        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        double avg = (double) sum / score.length;

        System.out.println("합계 = " + sum);
        System.out.println("평균 = " + avg);
    }
}
