// Ch4 - 2.9 이름 붙은 반복문 + break/continue
public class Ex14 {
    public static void main(String[] args) {

        // j==5 이면 외부 Loop1까지 한 번에 탈출
        System.out.println("=== break Loop1 (j==5이면 전체 종료) ===");
        Loop1:
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) break Loop1;
                System.out.print(i + "*" + j + "=" + (i * j) + "  ");
            }
            System.out.println();
        }

        System.out.println("\n=== continue Loop1 (j==5이면 해당 단 건너뜀) ===");
        Loop1:
        for (int i = 2; i <= 4; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 5) continue Loop1;  // 내부 for 나머지 건너뛰고 i++ 
                System.out.print(i + "*" + j + "=" + (i * j) + "  ");
            }
            System.out.println();
        }
    }
}
