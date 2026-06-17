// Ch5 - 1.5 다차원 배열 (2차원 배열 선언/초기화/출력)
public class Ex20 {
    public static void main(String[] args) {

        // 5행 3열 2차원 배열
        int[][] score = {
            {100, 100, 100},
            { 20,  20,  20},
            { 30,  30,  30},
            { 40,  40,  40},
            { 50,  50,  50}
        };

        System.out.println("       국어  영어  수학");
        for (int i = 0; i < score.length; i++) {         // 행: score.length = 5
            System.out.print((i + 1) + "번: ");
            for (int j = 0; j < score[i].length; j++) {  // 열: score[i].length = 3
                System.out.printf("%5d", score[i][j]);
            }
            System.out.println();
        }
    }
}
