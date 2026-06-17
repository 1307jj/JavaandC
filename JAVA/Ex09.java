// Ch4 - 2.3 중첩 for문 (구구단 2~9단)
public class Ex09 {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {          // 단
            for (int j = 1; j <= 9; j++) {      // 곱할 수
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
