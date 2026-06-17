// Ch5 - 1.4 배열 활용 예제1 (ArrayEx4) - 로또 번호 뽑기
public class Ex18 {
    public static void main(String[] args) {

        int[] ball = new int[45];

        // 1~45 순서대로 저장
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;    // ball[0]=1, ball[1]=2, ...
        }

        // ball[0]과 임의 위치(j)의 값을 100번 교환 → 섞기
        int temp = 0, j = 0;
        for (int i = 0; i < 100; i++) {
            j = (int)(Math.random() * 45); // 0~44
            temp    = ball[0];
            ball[0] = ball[j];
            ball[j] = temp;
        }

        // 앞 6개 출력
        System.out.print("로또 번호: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(ball[i] + " ");
        }
        System.out.println();
    }
}
