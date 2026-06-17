// Ch4 - 2.6 do-while문 (최소 1번 실행 보장)
public class Ex11 {
    public static void main(String[] args) {

        // do-while: 블럭{}을 먼저 실행한 뒤 조건 검사
        int i = 0;
        do {
            i++;
            System.out.print(i + " ");
        } while (i <= 5);

        System.out.println();

        // 비교: i가 처음부터 조건 불만족이어도 최소 1번 실행됨
        int x = 10;
        do {
            System.out.println("do-while 최소 1회 실행: x=" + x);
        } while (x < 5);   // 조건 false지만 1번은 실행
    }
}
