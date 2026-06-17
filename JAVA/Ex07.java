// Ch4 - 1.7 Math.random() (1~10 난수 생성)
public class Ex07 {
    public static void main(String[] args) {

        // 0.0 <= Math.random() < 1.0
        // × 10 → 0.0 이상 10.0 미만
        // (int) → 0~9
        // +1    → 1~10

        System.out.print("1~10 난수 10개: ");
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random() * 10) + 1;
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
