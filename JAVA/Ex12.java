// Ch4 - 2.7 break문 (합이 100 초과 시 반복 종료)
public class Ex12 {
    public static void main(String[] args) {

        int sum = 0;
        int i   = 0;

        while (true) {
            if (sum > 100) break;   // 합이 100 초과하면 while 탈출
            i++;
            sum += i;
        }

        System.out.println("i=" + i + ", sum=" + sum);
    }
}
