// Ch4 - 2.8 continue문 (3의 배수는 건너뛰기)
public class Ex13 {
    public static void main(String[] args) {

        // continue: 이후 문장 건너뛰고 다음 반복으로 이동
        // break와 달리 반복문 전체를 벗어나지 않음
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
