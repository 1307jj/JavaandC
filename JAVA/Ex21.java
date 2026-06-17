// Ch5 - 1.6 가변 배열 (행마다 열 크기가 다른 jagged array)
public class Ex21 {
    public static void main(String[] args) {

        // 마지막 차수 크기를 지정하지 않고 각각 다르게 지정
        int[][] jagged = new int[5][];
        jagged[0] = new int[4];
        jagged[1] = new int[3];
        jagged[2] = new int[2];
        jagged[3] = new int[2];
        jagged[4] = new int[3];

        // 값 채우기
        int num = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = num++;
            }
        }

        // 출력
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("jagged[" + i + "]: ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
